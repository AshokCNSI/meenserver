package com.meen.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meen.model.Item;

@Repository
public interface ItemDao extends CrudRepository<Item, Integer>{

	@Query("SELECT i FROM Item i, CategoryXItems ci "
			+ "WHERE ci.categoryCid =?1 "
			+ "AND ci.itemCid = i.itemCid "
			+ "AND ci.oprtlnFlag = 'A' "
			+ "AND i.oprtlnFlag = 'A'")
	Iterable<Item> findItemsByCategory(int category_sid);
	
	@Query("SELECT i FROM Item i, CategoryXItems ci, SellerXItem si, Users u "
			+ "WHERE ci.categoryCid =?1 "
			+ "AND ci.itemCid = i.itemCid "
			+ "AND ci.categoryXItemsCid = si.categoryXItemsCid "
			+ "AND si.userSid = u.userSid "
			+ "AND u.suspendedFlag <> 'Y' "
			+ "AND u.lockFlag <> 'Y' "
			+ "AND u.oprtlnFlag = 'A' "
			+ "AND ci.oprtlnFlag = 'A' "
			+ "AND si.oprtlnFlag = 'A' "
			+ "AND i.oprtlnFlag = 'A'")
	Iterable<Item> findAllSellerItemsByCategory(int category_sid);
	
	@Query("SELECT i FROM Item i, CategoryXItems ci, SellerXItem si, Users u "
			+ "WHERE ci.itemCid = i.itemCid "
			+ "AND ci.categoryXItemsCid = si.categoryXItemsCid "
			+ "AND si.userSid = ?1"
			+ "AND si.userSid = u.userSid "
			+ "AND u.suspendedFlag <> 'Y' "
			+ "AND u.lockFlag <> 'Y' "
			+ "AND u.oprtlnFlag = 'A' "
			+ "AND ci.oprtlnFlag = 'A' "
			+ "AND si.oprtlnFlag = 'A' "
			+ "AND i.oprtlnFlag = 'A'")
	Iterable<Item> findAllSellerItems(String user_sid);

}
