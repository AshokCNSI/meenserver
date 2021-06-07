package com.meen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meen.dao.CategoryDao;
import com.meen.model.Category;
import com.meen.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryDao categoryDao;
	
	@Override
	public Iterable<Category> fetchAll() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}

}
