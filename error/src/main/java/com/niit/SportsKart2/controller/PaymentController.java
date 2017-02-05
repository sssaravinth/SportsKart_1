package com.niit.SportsKart2.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.SportsKart2.model.dao.OrderDao;
import com.niit.SportsKart2.model.dao.Register2Dao;
import com.niit.SportsKart2.model.dao.ShippmentDao;
import com.niit.SportsKart2.model.entity.Cart;
import com.niit.SportsKart2.model.entity.CartItems;
import com.niit.SportsKart2.model.entity.Orders;
import com.niit.SportsKart2.model.entity.Register2;
import com.niit.SportsKart2.model.entity.Shippment;
import com.niit.SportsKart2.model.service.CartService;
import com.niit.SportsKart2.model.service.PaymentService;

@Controller
public class PaymentController {
	@Autowired
	private  PaymentService ps;
	@Autowired
	private CartService cs;
	@Autowired
	private Register2Dao ud;

	@Autowired
	private OrderDao od;
	
	@Autowired
	private ShippmentDao bad;
@RequestMapping("/welcome1")
public String pay(HttpServletRequest req)
{    //BY USENAME WE ARE CALLING THE USERID
	 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	 String username = auth.getName();  
		 		 
		   List<Register2> userDetail = ud.getRegister2ByName(username);//user details are stored in userDetail object
		 
		    System.out.println(userDetail.get(0).getId()); //using the userDetail object,we are calling the userid by getUserid()
		
		    Cart carts=new Cart();
		    
		//to store the userid in cart in cart table		
		   carts.setRegister2_fk(userDetail.get(0));//setId_fk is the foreign key of userid
//................................................................................................................................................................				
		    
		 //to store the quantity,productid,grandtotal in Cart table
		   
		   /*List<Cartitems> crt=cs.getAllCartitems();*/
		   List<CartItems> crt=cs.getbyuserid(userDetail.get(0).getId());
                   int tot=0;
	        	 
    				for(int i=0;i<crt.size();i++)
    					{ 									
    					carts.setProduct_fk(crt.get(i).getProductid_fk());
    					carts.setQuantity(crt.get(i).getQuantity());
			     		tot=(int) (tot+(crt.get(i).getTotalPrice()));
    					}


    				carts.setTotal(tot);     
		            ps.add(carts);
		            
//.....................................................................................................        
		            
		           //to store cartid in User table
		            userDetail.get(0).setId(userDetail.get(0).getId());
		            
		            userDetail.get(0).setCart(carts);//setCart is the foreign key setter method
		            
		            ud.edit(userDetail.get(0)); 
  //...........................................................................................................
		            
		            //delete caritem table, after add to the Cart  table
		    		for(int i=0;crt.size()>i;i++){
		    			cs.delete(crt.get(i).getCartItems_id());}

//...................................................................................................	
		    		
		  //to store the cartid,shipid,userid in Orders table  			
		    		
		    	List<Shippment> bd=bad.getbyid(userDetail.get(0).getId());//by using userid(billingaddress) 
		    		                                                                //we are storing the shipid in order table
		        
		    		Orders orders = new Orders();
		    		orders.setCartid_fk(carts);
		    		orders.setSid_fk(bd.get(0));
		    		orders.setRegister2_fk(userDetail.get(0));
		    	    od.add(orders);
 	 		  		return "welcome1";
}

}
