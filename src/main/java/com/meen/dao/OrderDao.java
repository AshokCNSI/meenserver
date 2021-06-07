package com.meen.dao;

import org.springframework.data.repository.CrudRepository;

import com.meen.model.Orders;

public interface OrderDao extends CrudRepository<Orders, Integer>{

}
