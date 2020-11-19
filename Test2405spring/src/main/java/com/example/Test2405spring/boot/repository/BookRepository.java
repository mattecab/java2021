package com.example.Test2405spring.boot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Test2405spring.boot.model.Book;



public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByTitle(String name);

	Book findById(long id);
}