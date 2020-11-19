package com.example.Test2405spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Test2405spring.boot.service.QuoteService;


@Controller
@RequestMapping("/quotes")


public class QuoteController {

	@Autowired
    QuoteService service;

	@RequestMapping("/show")
	public String showQuote (Model model) {

		model.addAttribute("quotes", service.findAll());
		return "library/quotes.html";
	}
}
