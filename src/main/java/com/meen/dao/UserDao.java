package com.meen.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.meen.model.UserXAddressBook;
import com.meen.model.Users;

public interface UserDao extends CrudRepository<Users, Integer>{
	
	@Query("SELECT u FROM Users u WHERE u.userSid = ?1")
	Users findById(String user_sid);
	
	@Query("SELECT u FROM UserXAddressBook u WHERE u.userSid = ?1 AND u.oprtlnFlag = 'A'")
	Iterable<UserXAddressBook> fetchUserAddress(String user_sid);

}
