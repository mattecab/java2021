package com.example.libraryVerdi.boot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryVerdi.boot.model.Book;
import com.example.libraryVerdi.boot.model.BookRented;

public class CartController {
	@RequestMapping(value = "Rent Book", method = RequestMethod.GET)
	public String add(@RequestParam("bookId") Long id, HttpSession session, Model model) {

		
		List<BookRented> cart = new ArrayList<BookRented>();

		//cart.add(new Book();
		//session.setAttribute("cart", cart);
		
		return "library/home";
	}}
		
		// ProductModel productModel = new ProductModel();

		/*if (session.getAttribute("cart") == null) {

			List<BookRented> cart = new ArrayList<BookRented>();

			cart.add(new Book(service.findById(id), 1));
			session.setAttribute("cart", cart);

		} else {

			List<BookRented> cart = (List<BookRented>) session.getAttribute("cart");

			int index = this.exists(id, cart);
			if (index == -1) {
				cart.add(new BookRented(service.findById(id), 1));
			} else {
				int quantity = cart.get(index).getQuantity() + 1;
				cart.get(index).setQuantity(quantity);
			}

			session.setAttribute("cart", cart);
		}*/

