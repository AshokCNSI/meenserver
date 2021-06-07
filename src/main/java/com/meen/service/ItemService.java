package com.meen.service;

import com.meen.model.Item;

public interface ItemService {

	Iterable<Item> getItemsByCategory(int category_sid);
	
	Iterable<Item> findAllSellerItemsByCategory(int category_sid);
	
	Iterable<Item> findAllSellerItems(String user_sid);

}
