package com.niit.SportsKart2.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.niit.SportsKart2.model.entity.Product;
import com.niit.SportsKart2.model.service.CartItemsService;
import com.niit.SportsKart2.model.service.CategoryService;
import com.niit.SportsKart2.model.service.ProductService;
import com.niit.SportsKart2.model.service.Register2Service;

@Controller
public class HomeController {
	@RequestMapping(value = { "/", "/index" })
	public String ShowMessgae(Map<String, Object> map) {
		System.out.println("in controller");
		map.put("categoryList", categoryService.getAllCategory());
		return "index";
	}

	@Autowired
	Register2Service register2Service;
	@Autowired
	CartItemsService cartItemsService;

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
		map.put("categoryList", categoryService.getAllCategory());

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
	public ModelAndView showMessage3(Map<String, Object> map) {
		map.put("categoryList", categoryService.getAllCategory());

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

	@RequestMapping("/Badmintor")
	public ModelAndView showMessage4(Model vol) {
		return new ModelAndView("badmintor", "productList", productService.getAllProduct());

	}

	@RequestMapping("/allproduct")
	public String view(@RequestParam("pdt") String id, Map<String, Object> map) {
		System.out.println("allproduct");
		map.put("productList", productService.getAllProductfromCategory(id));
		map.put("categoryList", categoryService.getAllCategory());
		return "allproduct";
	}

	@RequestMapping("/viewall")
	public String view(Map<String, Object> map) {
		map.put("categoryList", categoryService.getAllCategory());
		return "viewall";
	}

	@RequestMapping("/angularview")
	public @ResponseBody List<Product> pro() {

		return productService.getAllProduct();
	}

	@RequestMapping("/CartItem")
	public String Cart(Map<String, Object> map) {
		map.put("cartList", cartItemsService.getAllCartitems());
		map.put("categoryList", categoryService.getAllCategory());
		return "Cart";
	}
	
	@RequestMapping("/delete1")
	public String delpro(Map<String, Object> map,@RequestParam int id22) {
		                         //action id called on viewall
		productService.delete(id22);
		map.put("categoryList", categoryService.getAllCategory());
		return "allproduct";
	}

	
}
