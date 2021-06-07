package com.meen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.meen.model.Category;
import com.meen.model.Item;
import com.meen.service.CategoryService;
import com.meen.service.ItemService;

@RestController(value = "/category")
public class ItemController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/fetchAllCategory")
	public Iterable<Category> getCategory() {
		return categoryService.fetchAll();
	}
	
	@GetMapping("/fetchItemsByCategory")
	public Iterable<Item> getItemsByCategory(@PathVariable(value = "category_sid") int category_sid) {
		return itemService.getItemsByCategory(category_sid);
	}
	
	@GetMapping("/findAllSellerItemsByCategory")
	public Iterable<Item> findAllSellerItemsByCategory(@PathVariable(value = "category_sid") int category_sid) {
		return itemService.findAllSellerItemsByCategory(category_sid);
	}
	
	@GetMapping("/findAllSellerItems")
	public Iterable<Item> findAllSellerItems(@PathVariable(value = "category_sid") String user_sid) {
		return itemService.findAllSellerItems(user_sid);
	}
}
