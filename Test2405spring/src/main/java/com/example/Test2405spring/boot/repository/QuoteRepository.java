package com.example.Test2405spring.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Test2405spring.boot.model.Quote;


public interface QuoteRepository extends CrudRepository <Quote, Long> {

	Quote findById (long id);
}
