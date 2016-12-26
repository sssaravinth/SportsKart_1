package com.niit.SportsKart2.model.handler;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

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

	public Register2 initFlow() {
		return new Register2();
	}

	public String validateDetails(Register2 register2, MessageContext messageContext) {
		String status = "success";
		if (register2.getYourname().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("yourname").defaultText("UserId cannot be Empty").build());
			status = "failure";
		}
		if (register2.getEmailid().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("emailid").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if (register2.getMobilenumber().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("mobilenumber")
					.defaultText("Mobile Number cannot be Empty").build());
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
					new MessageBuilder().error().source("confirmpassword").defaultText("Password Mismatch").build());
			status = "failure";
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
		return "success";
	}

}
