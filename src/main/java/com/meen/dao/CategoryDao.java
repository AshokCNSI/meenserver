package com.meen.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meen.model.Category;

@Repository
public interface CategoryDao extends CrudRepository<Category, Integer>{

}
