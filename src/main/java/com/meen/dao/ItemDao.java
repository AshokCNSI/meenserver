package com.meen.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.meen.model.Item;

public interface ItemDao extends CrudRepository<Item, Integer>{

	@Query("SELECT i FROM Item i, CategoryXItems ci "
			+ "WHERE ci.catergory_cid =?1 "
			+ "AND ci.item_cid = i.item_cid "
			+ "AND ci.oprtlnFlag = 'A' "
			+ "AND i.oprtlnFlag = 'A'")
	Iterable<Item> findItemsByCategory(int category_sid);
	
	@Query("SELECT i FROM Item i, CategoryXItems ci, SellerXItem si, Users u "
			+ "WHERE ci.catergory_cid =?1 "
			+ "AND ci.item_cid = i.item_cid "
			+ "AND ci.categoryXItemsCid = si.categoryXItemsCid "
			+ "AND si.userSid = u.userSid "
			+ "AND u.suspended_flag <> 'Y' "
			+ "AND u.lockFlag <> 'Y' "
			+ "AND u.oprtlnFlag = 'A' "
			+ "AND ci.oprtlnFlag = 'A' "
			+ "AND si.oprtlnFlag = 'A' "
			+ "AND i.oprtlnFlag = 'A'")
	Iterable<Item> findAllSellerItemsByCategory(int category_sid);
	
	@Query("SELECT i FROM Item i, CategoryXItems ci, SellerXItem si, Users u "
			+ "WHERE ci.item_cid = i.item_cid "
			+ "AND ci.categoryXItemsCid = si.categoryXItemsCid "
			+ "AND si.userSid = ?1"
			+ "AND si.userSid = u.userSid "
			+ "AND u.suspended_flag <> 'Y' "
			+ "AND u.lockFlag <> 'Y' "
			+ "AND u.oprtlnFlag = 'A' "
			+ "AND ci.oprtlnFlag = 'A' "
			+ "AND si.oprtlnFlag = 'A' "
			+ "AND i.oprtlnFlag = 'A'")
	Iterable<Item> findAllSellerItems(String user_sid);

}
