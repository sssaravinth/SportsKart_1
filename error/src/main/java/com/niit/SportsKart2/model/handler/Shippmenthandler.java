package com.niit.SportsKart2.model.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.niit.SportsKart2.model.dao.Register2Dao;
import com.niit.SportsKart2.model.entity.Cart;
import com.niit.SportsKart2.model.entity.CartItems;
import com.niit.SportsKart2.model.entity.Register2;
import com.niit.SportsKart2.model.entity.Role;
import com.niit.SportsKart2.model.entity.Shippment;
import com.niit.SportsKart2.model.service.CartService;
import com.niit.SportsKart2.model.service.ProductService;
import com.niit.SportsKart2.model.service.Register2Service;
import com.niit.SportsKart2.model.service.ShippmentService;
@Component
public class Shippmenthandler {
	
	@Autowired
	private ShippmentService shippmentService;
	
	
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private Register2Dao register2Dao;
	
	@Autowired
	private Register2Service register2Service;
	
	@Autowired
	private ProductService productService;
	
	public Shippment initFlow() {
		return new Shippment();
	}

	public String validateDetails(Shippment shippment, MessageContext messageContext) {
		String status = "success";
		if (shippment.getName().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("name").defaultText("Name cannot be Empty").build());
			status = "failure";
		}
		if (shippment.getAddress().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("address").defaultText("Address cannot be Empty").build());
			status = "failure";
		}
		if (shippment.getCity().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("city")
					.defaultText("City cannot be Empty").build());
			status = "failure";
		}
		if (shippment.getState().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("state")
					.defaultText("State cannot be Empty").build());
			status = "failure";
		}
		if (shippment.getPincode().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("pincode")
					.defaultText("Pincode cannot be Empty").build());
			status = "failure";
		}
		if (shippment.getMobilenumber().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("mobilenumber")
					.defaultText("Mobile Number cannot be Empty").build());
			status = "failure";
		}
		
		
		return status;
	}
	/*public String ship(Shippment shippment){ 
		long totalPrice=0;
		List<CartItems>cartItems = cartService.getAllCartitems();
		for(CartItems C : cartItems){
			 totalPrice = totalPrice+C.getTotalPrice();
		}
		Cart cart = new Cart();
		cart.setTotal(totalPrice);
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName(); // get logged in username
		//Products productDetail = productService.getProducts(productId);
		List<Register2> userDetail = register2Service.getRegister2ByName(username);
		
		for(int i=0;i<userDetail .size();i++)
		   { 
			shippment.setId_fk(userDetail.get(i));
		   }
		    
		shippmentService.saveorupdate(shippment);
		
		cart.setRegister2_fk(userDetail.get(0));
		java.util.Date now = new java.util.Date();
		cart.setDate_time(now);
		
		List<CartItems>ct =cartItemsService.getCartItemsById(userDetail.get(0).getId());
		cart.setCartItems(ct);
		
		List<CartItems>ct1 =cartItemsService.getAllCartitems();
		for(int i=0;ct1.size()>i;i++){
		cartService.delete(ct1.get(0).getCartItems_id());}
		
		//CartService.add(cart);
		shippmentService.add(shippment);
		
		
		return "success";
	}*/

}
