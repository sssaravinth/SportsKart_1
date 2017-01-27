package com.niit.SportsKart2.model.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.niit.SportsKart2.model.entity.Shippment;
import com.niit.SportsKart2.model.service.ShippmentService;
@Component
public class Shippmenthandler {
	
	@Autowired
	private ShippmentService shippmentService;
	
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
	public String ship(Shippment shippment){
		shippmentService.add(shippment);
		return "success";
	}

}
