package com.example.shop.boot.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.example.shop.boot.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);
}