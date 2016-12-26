package com.niit.SportsKart2.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.SportsKart2.model.entity.CartItems;
import com.niit.SportsKart2.model.entity.Product;
import com.niit.SportsKart2.model.service.CartItemsService;
import com.niit.SportsKart2.model.service.CategoryService;
import com.niit.SportsKart2.model.service.ProductService;

@Controller
public class CartController {

	@Autowired
	ProductService productService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	CartItemsService cartItemsService;

	@RequestMapping("/viewDetails")
	public String viewDetail(@RequestParam("pdt1") int productId, Map<String, Object> map, Product product) {
		map.put("categoryList", categoryService.getAllCategory());
		Product p = productService.getProduct(productId);
		map.put("product", p);
		return "viewDetails";
	}

	@RequestMapping(value = "/addtocart")
	public String AddtoCart(@RequestParam("cart") int id, Map<String, Object> map, Product product) {
		CartItems cart = new CartItems();
		Product p1 = productService.getProduct(id);
		cart.setQuantity("1");
		cart.setTotalPrice(p1.getPrice());
		cart.setProductid_fk(p1);//foreign key of Productid
		map.put("product", p1);
		cartItemsService.add(cart);
		/*map.put("cartList", cartItemsService.getAllCartitems());*/

		return "Cart";

	}
}
