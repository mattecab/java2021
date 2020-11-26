package com.example.libraryVerdi.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping ("/books")
public class BookController {
	
	
	@RequestMapping(value = "/insertBook", method = RequestMethod.POST)
	public String insertBook() {
		return "library/addBook";
	}
}
