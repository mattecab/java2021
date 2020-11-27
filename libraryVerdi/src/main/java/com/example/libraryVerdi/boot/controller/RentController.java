package com.example.libraryVerdi.boot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryVerdi.boot.model.Book;

@Controller
@RequestMapping("/books")
public class RentController {
	@RequestMapping("/rent")
	public String rent () {
		
		return "library/rent";

}
	

		//model.addAttribute("items", service.findAll());
	}