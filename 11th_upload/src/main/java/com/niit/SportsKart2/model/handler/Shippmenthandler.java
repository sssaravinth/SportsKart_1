package com.niit.SportsKart2.model.handler;

import java.util.List;
import java.util.regex.Pattern;

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
import com.niit.SportsKart2.model.service.CartItemsService;
import com.niit.SportsKart2.model.service.CartService;
import com.niit.SportsKart2.model.service.ProductService;
import com.niit.SportsKart2.model.service.Register2Service;
import com.niit.SportsKart2.model.service.ShippmentService;
@Component
public class Shippmenthandler {
	
	@Autowired
	private ShippmentService shippmentService;
	
	@Autowired
	private CartItemsService cartItemsService;
	
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
		if(! Pattern.matches(".*[a-zA-Z]+.*", shippment.getName())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"name").defaultText("userName should contain only alphabets").build());
			status = "failure";
		}
		
		if(! Pattern.matches("[a-zA-Z]+\\.?", shippment.getName())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"name").defaultText("userName should not contain any special charecters").build());
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
		if(! Pattern.matches("^[0-9]{1,6}$", shippment.getPincode())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"pincode").defaultText("Enter 6 digit pincode").build());
			status = "failure";
		}
		if (shippment.getMobilenumber().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("mobilenumber")
					.defaultText("Mobile Number cannot be Empty").build());
			status = "failure";
		}
		if(! Pattern.matches("^[0-9]{2}[0-9]{8}$", shippment.getMobilenumber())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"mobilenumber").defaultText("Enter 10 digit mobile number").build());
			status = "failure";
		}

		
		
		return status;
	}
	public String ship(Shippment shippment){ 
		long totalPrice=0;
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName(); // get logged in username
		//Products productDetail = productService.getProducts(productId);
		List<Register2> userDetail = register2Service.getUserByName(username);
		List<CartItems> cartItems=cartService.getCartItemById(userDetail.get(0).getId());
		for(CartItems C : cartItems){
			 totalPrice = totalPrice+C.getTotalPrice();
		}
		Cart cart = new Cart();
		cart.setTotal(totalPrice);
		/*Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName(); // get logged in username
		//Products productDetail = productService.getProducts(productId);
		List<Register2> userDetail = register2Service.getUserByName(username);*/
		cart.setRegister2_fk(userDetail.get(0));
		java.util.Date now = new java.util.Date();
		cart.setDate_time(now);
		
		/*List<CartItems>ct =cartItemsService.getCartItemsById(userDetail.get(0).getId());
		cart.setCartItems(ct);*/
		
		/*List<CartItems>ct1 =cartItemsService.getAllCartitems();
		for(int i=0;ct1.size()>i;i++){
		cartService.delete(ct1.get(0).getCartItems_id());}*/
		
		cartService.add(cart);
		shippment.setId_fk(userDetail.get(0));
		shippmentService.add(shippment);
		
		//Register2 register = new Register2();
		/*register.setId(userDetail.get(0).getId());
		register.setCart(cart);*/
		userDetail.get(0).setId(userDetail.get(0).getId());
		System.out.println(userDetail.get(0).getId());
		
		userDetail.get(0).setCart(cart);

		register2Service.add(userDetail.get(0));
		
		
		
		return "success";
	}

}