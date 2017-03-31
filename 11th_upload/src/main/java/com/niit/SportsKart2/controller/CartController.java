package com.niit.SportsKart2.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.niit.SportsKart2.model.entity.CartItems;
import com.niit.SportsKart2.model.entity.Product;
import com.niit.SportsKart2.model.entity.Register2;
import com.niit.SportsKart2.model.service.CartItemsService;
import com.niit.SportsKart2.model.service.CartService;
import com.niit.SportsKart2.model.service.CategoryService;
import com.niit.SportsKart2.model.service.ProductService;
import com.niit.SportsKart2.model.service.Register2Service;

@Controller
public class CartController {

	@Autowired
	ProductService productService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	CartItemsService cartItemsService;
	
	@Autowired
	CartService cartService;
	
	@Autowired
	private Register2Service register2Service;
	
	@RequestMapping("/viewDetails")
	public String viewDetail(@RequestParam("pdt1") int productId, Map<String, Object> map, Product product) {
		map.put("categoryList", categoryService.getAllCategory());
		Product p = productService.getProduct(productId);
		map.put("product", p);
		map.put("categoryList", categoryService.getAllCategory());
		return "viewDetails";
	}
	
	

	@RequestMapping("/addtocart")
	public String AddtoCart(@RequestParam("cart") int id, Map<String, Object> map, Product product,HttpSession session) 
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName(); // get logged in username
		List<Register2> userDetail = register2Service.getUserByName(username);
		
		CartItems cart = new CartItems();
		Product p1 = productService.getProduct(id);	
		
		List<CartItems> crt=cartService.getCartItemById(userDetail.get(0).getId());
		// search the table whether the product is new or existing  
		for(int i=0;i<crt.size();i++)
		{	
			//get product id from the cartitem table
			int tempid=crt.get(i).getProductid_fk().getProductid();
			//for update the existing product
			if(tempid==id)
			{	
				int quantity=crt.get(i).getQuantity()+1;//if same product added,it wil increase the quantity
				crt.get(i).setQuantity(quantity);
				int price=p1.getPrice()*quantity;//this wil multiply prod price * qty
				crt.get(i).setTotalPrice(price);
				cartItemsService.update(crt.get(i));
				map.put("cartList", crt);
				
				return "Cart";
			}
		}
		
		cart.setQuantity(1);//setter method of quantity in cartitems table
		cart.setTotalPrice(p1.getPrice());
		cart.setProductid_fk(p1);//foreign key of Productid
		
		
		cart.setRegister2_fk(userDetail.get(0));
		
		cartItemsService.add(cart);//add the quantity,total,productid in cartitems table using the cart object
		List<CartItems> crts=cartService.getCartItemById(userDetail.get(0).getId());
		map.put("product", p1);
		map.put("cartList", crts);
		session.setAttribute("cartlength", cartItemsService.cartLength());
		
		map.put("categoryList", categoryService.getAllCategory());
		map.put("productList", productService.getAllProduct());
		return "Cart";

	}
	@RequestMapping("/remove")
	public String rem(@RequestParam("pdt3") int id, Map<String, Object> map,HttpSession session) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName(); // get logged in username
		List<Register2> userDetail = register2Service.getUserByName(username);
		cartItemsService.delete(id);
		map.put("cartList",cartService.getCartItemById(userDetail.get(0).getId()));
		session.setAttribute("cartlength", cartItemsService.cartLength());
		return "Cart";
	}
}