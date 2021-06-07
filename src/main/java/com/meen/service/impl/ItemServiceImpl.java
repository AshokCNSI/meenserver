package com.meen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.meen.dao.ItemDao;
import com.meen.model.Item;
import com.meen.service.ItemService;

public class ItemServiceImpl implements ItemService{
	
	@Autowired
	ItemDao itemDao;
	
	@Override
	public Iterable<Item> getItemsByCategory(int category_sid) {
		// TODO Auto-generated method stub
		return itemDao.findItemsByCategory(category_sid);
	}

	@Override
	public Iterable<Item> findAllSellerItemsByCategory(int category_sid) {
		// TODO Auto-generated method stub
		return itemDao.findAllSellerItemsByCategory(category_sid);
	}

	@Override
	public Iterable<Item> findAllSellerItems(String user_sid) {
		// TODO Auto-generated method stub
		return itemDao.findAllSellerItems(user_sid);
	}

}
