package com.example.shop.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.shop.boot.model.CreditCard;



public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {

	CreditCard findById(long id);
}
