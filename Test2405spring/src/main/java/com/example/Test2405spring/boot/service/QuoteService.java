package com.example.Test2405spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test2405spring.boot.model.Quote;
import com.example.Test2405spring.boot.repository.QuoteRepository;



@Service
public class QuoteService {

	@Autowired
	QuoteRepository repository;

	
	public Iterable<Quote> findAll() {

		return repository.findAll();
	}

}