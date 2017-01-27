package com.niit.SportsKart2.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.niit.SportsKart2.model.entity.CartItems;
import com.niit.SportsKart2.model.entity.Product;
import com.niit.SportsKart2.model.service.CartItemsService;
import com.niit.SportsKart2.model.service.CartService;
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
	
	@Autowired
	CartService cartService;

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
		CartItems cart = new CartItems();
		Product p1 = productService.getProduct(id);	
		
		List<CartItems> crt=cartItemsService.getAllCartitems();
		/* search the table whether the product is new or existing*/
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
				map.put("cartList", cartItemsService.getAllCartitems());
				
				return "cart";
			}
		}
		
		cart.setQuantity(1);//setter method of quantity in cartitems table
		cart.setTotalPrice(p1.getPrice());
		cart.setProductid_fk(p1);//foreign key of Productid
		cartItemsService.add(cart);//add the quantity,total,productid in cartitems table using the cart object
		map.put("product", p1);
		map.put("cartList", cartItemsService.getAllCartitems());
		session.setAttribute("cartlength", cartItemsService.cartLength());
		
		map.put("categoryList", categoryService.getAllCategory());
		map.put("productList", productService.getAllProduct());
		return "Cart";

	}
	@RequestMapping("/remove")
	public String rem(@RequestParam("pdt3") int id, Map<String, Object> map,HttpSession session) {
		cartItemsService.delete(id);
		map.put("cartList", cartItemsService.getAllCartitems());
		session.setAttribute("cartlength", cartItemsService.cartLength());
		return "Cart";
	}
}
