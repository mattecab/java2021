package com.example.libraryVerdi.boot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryVerdi.boot.model.Book;
import com.example.libraryVerdi.boot.model.BookRented;
import com.example.libraryVerdi.boot.service.BookService;

@Controller
@RequestMapping(value = "cart")

public class CartController {


	@Autowired
	BookService service;

	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String home(HttpSession session) {

		return "library/Cart";
	}

	@RequestMapping(value = "rent", method = RequestMethod.GET)
	public String add(@RequestParam("bookId") Long id, HttpSession session) {


	

		// ProductModel productModel = new ProductModel();
		if (session.getAttribute("cart") == null) {

			List<BookRented> cart = new ArrayList<BookRented>();

			cart.add(new BookRented(service.findById(id)));
			session.setAttribute("cart", cart);

		} 
		
		else {

			List<BookRented> cart = (List<BookRented>) session.getAttribute("cart");

            cart.add(new BookRented(service.findById(id)));


			
				cart.add(new BookRented(service.findById(id)));
			


			session.setAttribute("cart", cart);
		}

		String sid = session.getId();
		session.setAttribute("sid", sid);
		System.out.println("Session id: " + sid);


		return "redirect:/cart/show";
	}

	@RequestMapping(value = "returnBook", method = RequestMethod.GET)
	public String bookback(@RequestParam("bookId") Long id, HttpSession session) {

		// ProductModel productModel = new ProductModel();
		List<BookRented> cart = (List<BookRented>) session.getAttribute("cart");
		cart.remove(service.findById(id));
		session.setAttribute("cart", cart);

		return "redirect:/books/show";
	}

	@RequestMapping(value = "deleteSession", method = RequestMethod.GET)
	public String deleteSession(HttpSession session) {

		if (session.getAttribute("cart") != null) {
			session.invalidate();
		}

		return "/home";
	}

	@RequestMapping(value = "deleteCart", method = RequestMethod.GET)
	public String deleteCart(HttpSession session) {

		if (session.getAttribute("cart") != null) {

			// ProductModel productModel = new ProductModel();
			List<BookRented> cart = new ArrayList<BookRented>();
			cart.removeAll(cart);
			session.setAttribute("cart", cart);

		}

		return "/home";
	
	
}

	

	

	

	
}

