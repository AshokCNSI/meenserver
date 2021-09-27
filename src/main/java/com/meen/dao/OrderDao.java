package com.meen.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meen.model.Orders;

@Repository
public interface OrderDao extends CrudRepository<Orders, Integer>{

}
