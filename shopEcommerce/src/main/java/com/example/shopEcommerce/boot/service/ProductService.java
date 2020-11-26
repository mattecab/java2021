package com.example.shopEcommerce.boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shopEcommerce.boot.model.Product;
import com.example.shopEcommerce.boot.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;

	public Iterable<Product> findAll() {

		return repository.findAll();
	}

	public void insertProduct (Product product) {

		repository.save(product);
	}

	public Product findById(long id) {

		return repository.findById(id);
	}

}

