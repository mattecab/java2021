package com.example.libraryVerdi.boot.controller;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/books")
public class BookController {
	
	@RequestMapping("/addBook")
	public String addBook (Model model) {
		
		return "library/addBook";
	}
	
	
	@RequestMapping(value = "/insertBook", method = RequestMethod.GET)
	public String insertBook(@RequestParam("name") String name, @RequestParam("author") String author,@RequestParam("id") Long id, Book book) {
		
		List<Book> listbook = new ArrayList<Book>();
		//listbook.add(new Book(id,name,author));
		
		
		return "library/ListBook";
	
	
	}}


