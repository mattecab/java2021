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
	
	@RequestMapping("/list")
	public String show() {
		
		return "library/show";
	}
	
	

	}


