package com.meen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meen.dao.UserDao;
import com.meen.dao.UserXAddressDao;
import com.meen.model.UserXAddressBook;
import com.meen.model.Users;
import com.meen.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	UserXAddressDao userXAddressDao;
	
	@Override
	public Users save(Users user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public Users fetchUserByID(String user_sid) {
		// TODO Auto-generated method stub
		return userDao.findById(user_sid);
	}

	@Override
	public Iterable<UserXAddressBook> fetchUserAddress(String user_sid) {
		// TODO Auto-generated method stub
		return userDao.fetchUserAddress(user_sid);
	}

	@Override
	public UserXAddressBook addUserAddress(UserXAddressBook userXAddressBook) {
		// TODO Auto-generated method stub
		return userXAddressDao.save(userXAddressBook);
	}

	@Override
	public UserXAddressBook updateUserAddress(UserXAddressBook userXAddressBook) {
		// TODO Auto-generated method stub
		return userXAddressDao.save(userXAddressBook);
	}

	@Override
	public void deleteUserAddress(Integer user_x_address_sid) {
		// TODO Auto-generated method stub
		userXAddressDao.deleteById(user_x_address_sid);
	}

}
