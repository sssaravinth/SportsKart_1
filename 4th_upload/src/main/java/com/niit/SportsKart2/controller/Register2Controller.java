package com.niit.SportsKart2.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.SportsKart2.model.entity.Register2;
import com.niit.SportsKart2.model.entity.Role;
import com.niit.SportsKart2.model.service.CategoryService;
import com.niit.SportsKart2.model.service.Register2Service;
import com.niit.SportsKart2.model.service.RoleService;



@Controller
public class Register2Controller {
	@Autowired
	private Register2Service register2Service;
	
	@Autowired
	RoleService roleService;
	
	

	@RequestMapping("/register")
	public String setupregForm(Map<String, Object> map){
			/*@ModelAttribute("register1") Register1 register1), BindingResult result {*/

		Register2 register11 = new Register2();
		map.put("register2", register11);// map.put("command name or
		// key",valuei.e the object of pojo
		// class)
		map.put("register2List", register2Service.getAllRegister2());

		return "register";
	}

	@RequestMapping(value = "register2", method = RequestMethod.POST)
	public String doregActions(@Valid @ModelAttribute("register2") Register2 register2 /* command name,pojo class,pojo class obj */, BindingResult result,
			@RequestParam String action/* the name of the button */, Map<String, Object> map) {
		{
			if(result.hasErrors()){/*for validation*/
				return "register";
			}
		}
		Role rol=new Role();
		Register2 register2Result = new Register2();
		switch (action.toLowerCase()) { /*will convert upper case to lower case*/
		case "register":
			
			
			rol.setRole("ROLE_USER");
			rol.setId_fk(register2);
			
			
			register2.setEnabled(true);
			register2Service.add(register2);
			roleService.add(rol);
			break;
		case "edit":
			register2Service.edit(register2);
			break;
		case "delete":
			register2Service.delete(register2.getId());
			System.out.println("delete in controller");
			break;
				}

		/*register2Result = register2;*/
		map.put("register2", register2Result);
		map.put("register2List", register2Service.getAllRegister2());
		
		return "register";
	}
	@RequestMapping("/deleteRegister2")
	public String deleteusr(@RequestParam int id) {
		register2Service.delete(id);
		System.out.println("delete in controller");
		return "redirect:userDetails";

	}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	 public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		 System.out.println("in login logout method");
	     Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	     if (auth != null){    
	         new SecurityContextLogoutHandler().logout(request, response, auth);
	     }
	     return "redirect: index?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	 }	 
	
}