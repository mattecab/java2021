package com.example.libraryVerdi.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/books")
public class ReturnController {

	@RequestMapping("/back")
	public String back() {
		
		return "library/return";
	}
}
