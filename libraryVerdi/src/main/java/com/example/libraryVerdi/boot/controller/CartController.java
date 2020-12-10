package com.example.libraryVerdi.boot.controller;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
import com.example.libraryVerdi.boot.service.ReservationsService;
import com.example.libraryVerdi.boot.utils.StatusSession;


@Controller
@RequestMapping(value = "cart")

public class CartController {


	@Autowired
	BookService service;
	
	@Autowired
	ReservationsService Resaservice;

	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String home(HttpSession session) {

		return "library/Cart";
	}

	@RequestMapping(value = "rent", method = RequestMethod.GET)
	public String add(@RequestParam("bookId") Long id, HttpSession session) {


		List<BookRented> cart ;

		// ProductModel productModel = new ProductModel();
		if (session.getAttribute("cart") == null) {

			cart = new ArrayList<BookRented>();

			cart.add(new BookRented(service.findById(id)));
			session.setAttribute("cart", cart);
            session.setAttribute("status", StatusSession.RENTED);
            
           
            String sid = session.getId();
    		session.setAttribute("sid", sid);
    		System.out.println("Session id: " + sid);

		} 
		
		else {

			cart = (List<BookRented>) session.getAttribute("cart");

            cart.add(new BookRented(service.findById(id)));
            session.setAttribute("status", StatusSession.RENTED);
			session.setAttribute("cart", cart);
		}

		

		return "redirect:/cart/show";
	}

	@RequestMapping(value = "returnBook", method = RequestMethod.GET)
	public String bookback(@RequestParam("bookId") Long id, HttpSession session) {

		// ProductModel productModel = new ProductModel();
		List<BookRented> cart = (List<BookRented>) session.getAttribute("cart");
		int index = exists(id, cart);
		cart.remove(index);
		session.setAttribute("cart", cart);
		return "redirect:/cart/show";
	}

	@RequestMapping(value = "deleteSession", method = RequestMethod.GET)
	public String deleteSession(HttpSession session) {

		if (session.getAttribute("cart") != null) {
			session.invalidate();
		}

		return "library/home";
	}
	private static int exists(Long id, List<BookRented> cart) {

		for (int i = 0; i < cart.size(); i++) {

			if (cart.get(i).getBook().getId() == id) {
				return i;
			}

		}
		return -1;}

	@RequestMapping(value = "deleteCart", method = RequestMethod.GET)
	public String deleteCart(HttpSession session) {

		if (session.getAttribute("cart") != null) {

			// ProductModel productModel = new ProductModel();
			List<BookRented> cart = (List<BookRented>) session.getAttribute("cart");
			cart.removeAll(cart);
			session.setAttribute("cart", cart);

		}

		return "library/home";
	
	
}

	

	

	

	
}

