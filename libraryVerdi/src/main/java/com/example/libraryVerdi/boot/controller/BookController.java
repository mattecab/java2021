package com.example.libraryVerdi.boot.controller;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryVerdi.boot.service.BookService;

@Controller
@RequestMapping ("/books")
public class BookController {
	@Autowired
	BookService service;

	
	@RequestMapping("/show")
	public String show(Model model) {
		model.addAttribute("books", service.findAll());

		return "library/ListBook";
	}
	
	

	}


