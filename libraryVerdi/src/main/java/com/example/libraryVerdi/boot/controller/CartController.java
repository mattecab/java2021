package com.example.libraryVerdi.boot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class CartController {
	@RequestMapping(value = "rent the book", method = RequestMethod.GET)
	public String add(@RequestParam("bookId") Long id, HttpSession session) {

		// ProductModel productModel = new ProductModel();

		if (session.getAttribute("cart") == null) {

			List<ProductCart> cart = new ArrayList<ProductCart>();

			cart.add(new ProductCart(service.findById(id), 1));
			session.setAttribute("cart", cart);

		} else {

			List<ProductCart> cart = (List<ProductCart>) session.getAttribute("cart");

			int index = this.exists(id, cart);
			if (index == -1) {
				cart.add(new ProductCart(service.findById(id), 1));
			} else {
				int quantity = cart.get(index).getQuantity() + 1;
				cart.get(index).setQuantity(quantity);
			}

			session.setAttribute("cart", cart);
		}
}
