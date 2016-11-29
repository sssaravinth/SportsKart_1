package com.niit.SportsKart2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.SportsKart2.model.service.CategoryService;
import com.niit.SportsKart2.model.service.ProductService;
import com.niit.SportsKart2.model.service.Register2Service;

@Controller
public class HomeController {
	@RequestMapping(value = { "/", "/index" })
	public String ShowMessgae() {
		System.out.println("in controller");
		ModelAndView m = new ModelAndView("index");

		return "index";

	}

	/*@RequestMapping("/login")
	public String showMessage1() {
		return "login";
			}*/

	@Autowired
	Register2Service register2Service;

	@RequestMapping("/userDetails")
	public String showMessage2(Map<String, Object> map) {
		map.put("register2List", register2Service.getAllRegister2());

		return "userDetails";
	}

	@Autowired
	ProductService productService;

	@RequestMapping("/productDetails")
	public String showMessage4(Map<String, Object> map) {
		map.put("productList", productService.getAllProduct());

		return "productDetails";
	}

	@Autowired
	CategoryService categoryService;

	@RequestMapping("/categoryDetails")
	public String showMessage5(Map<String, Object> map) {
		System.out.println("hi");

		map.put("categoryList", categoryService.getAllCategory());

		return "categoryDetails";
	}

	@RequestMapping("/VolleyBall")
	public ModelAndView showMessage3(Model vol) {
		return new ModelAndView("volleyball", "productList", productService.getAllProduct());

	}

	@RequestMapping("/login")
	public ModelAndView getLoginForm(@RequestParam(required = false) String authfailed, String logout, String denied) {
		String message = "";
		if (authfailed != null) {
			message = "Invalid username of password, try again !";
		} else if (logout != null) {
			message = "Logged Out successfully, login again to continue !";
		} else if (denied != null) {
			message = "Access denied for this user !";
		}
		return new ModelAndView("login", "message", message);
	}

	@RequestMapping("/user")
	public String geUserPage() {
		return "/user";
	}

	@RequestMapping("/admin")
	public String geAdminPage() {
		return "/admin";
	}

	@RequestMapping("/403page")
	public String ge403denied() {
		return "redirect:login?denied";
	}

}
