package com.niit.SportsKart2.model.handler;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import com.niit.SportsKart2.model.entity.Register2;
import com.niit.SportsKart2.model.entity.Role;
import com.niit.SportsKart2.model.service.Register2Service;
import com.niit.SportsKart2.model.service.RoleService;

@Component
public class Demohandler {
	@Autowired
	private Register2Service register2Service;

	@Autowired
	RoleService roleService;
	
	 @Autowired
		EmailClass mailtouser; 

	public Register2 initFlow() {
		return new Register2();
	}

	public String validateDetails(Register2 register2, MessageContext messageContext) {
		String status = "success";
		if (register2.getYourname().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("yourname").defaultText("userName cannot be Empty").build());
			status = "failure";
		}
		
		if(! Pattern.matches(".*[a-zA-Z]+.*", register2.getYourname())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"yourname").defaultText("userName should contain only alphabets").build());
			status = "failure";
		}
		
		if(! Pattern.matches("[a-zA-Z]+\\.?", register2.getYourname())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"yourname").defaultText("userName should not contain any special charecters").build());
			status = "failure";
		}
		
		if (register2.getEmailid().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("emailid").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if(! Pattern.matches("^(.+)@(.+)$", register2.getEmailid())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"emailid").defaultText("Enter correct form for email").build());
			status = "failure";
		}
		
		if (register2.getMobilenumber().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("mobilenumber")
					.defaultText("Mobile Number cannot be Empty").build());
			status = "failure";
		}
		
		if(! Pattern.matches("^[0-9]{2}[0-9]{8}$", register2.getMobilenumber())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"mobilenumber").defaultText("Enter 10 digit mobile number").build());
			status = "failure";
		}
		
		if (register2.getEnterpassword().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("enterpassword")
					.defaultText("Password cannot be Empty").build());
			status = "failure";
		}
		if (register2.getConfirmpassword().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("confirmpassword")
					.defaultText("ConfirmPassword cannot be Empty").build());
			status = "failure";
		}
		if ((register2.getEnterpassword().equals(register2.getConfirmpassword())) == false) {

			messageContext.addMessage(
					new MessageBuilder().error().source("confirmpassword").defaultText("Password InCorrect").build());
			status = "failure";
		}
		
		List<Register2> userList =register2Service.getAllRegister2();
		for(Register2 Usrlist: userList ){
			if((register2.getYourname().equals(Usrlist.getYourname()))){
				
				messageContext.addMessage(new MessageBuilder().error().source(
						"yourname").defaultText("Sorry UserName Already exsist").build());
				status = "failure";
			}
			
		}
		
		return status;
	}

	public String doregActions(Register2 register2) {

		Role rol = new Role();

		rol.setRole("ROLE_USER");
		rol.setId_fk(register2);

		register2.setEnabled(true);
		register2Service.add(register2);
		roleService.add(rol);
		
		
		//String toAddr = "sss.aravinth@gmail.com";
		String toAddr = register2.getEmailid();
		String fromAddr = "sss.aravinth@gmail.com";
 
		// email subject
		String subject = "SportsKart welcomes you";
 
		// email body
		String body = "Welcome to the SportsKart "+register2.getYourname()+"."+System.getProperty("line.separator")
				+"Thanks to begin with us."+System.getProperty("line.separator")
				+System.getProperty("line.separator")
				+System.getProperty("line.separator")
				+System.getProperty("line.separator")
				+ "------------"+System.getProperty("line.separator")
				+ "-SportsKart";
		mailtouser.mailmethod(toAddr, fromAddr, subject, body);
		
		return "success";
	}

}
