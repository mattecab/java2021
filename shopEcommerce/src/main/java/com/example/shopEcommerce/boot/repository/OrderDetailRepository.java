package com.example.shopEcommerce.boot.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.shopEcommerce.boot.model.OrderDetail;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long> {

}