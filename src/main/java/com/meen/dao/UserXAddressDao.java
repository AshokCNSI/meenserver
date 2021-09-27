package com.meen.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meen.model.UserXAddressBook;

@Repository
public interface UserXAddressDao extends CrudRepository<UserXAddressBook, Integer>{

}
