package com.example.Test2405spring.boot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test2405spring.boot.model.Book;
import com.example.Test2405spring.boot.repository.BookRepository;



@Service
public class BookService {
	

		@Autowired
		BookRepository repository;

		public Iterable<Book> findAll() {

			return repository.findAll();
		}
	}