  
package com.example.shop.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shop.boot.model.CreditCard;
import com.example.shop.boot.repository.CreditCardRepository;




@Service
public class CreditCardService {

	@Autowired
	CreditCardRepository repository;

	
	public Iterable<CreditCard> findAll() {

		return repository.findAll();
	}

}