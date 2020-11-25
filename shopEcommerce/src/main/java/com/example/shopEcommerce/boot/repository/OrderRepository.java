package com.example.shopEcommerce.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.shopEcommerce.boot.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
