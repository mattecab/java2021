package com.example.shopEcommerce.boot.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.shopEcommerce.boot.model.CreditCard;


public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {

	CreditCard findById(long id);
}
