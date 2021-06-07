package com.meen.service;

import com.meen.model.UserXAddressBook;
import com.meen.model.Users;

public interface UserService {
	
	public Users save(Users user);
	
	public Users fetchUserByID(String user_sid);

	public Iterable<UserXAddressBook> fetchUserAddress(String user_sid);

	public UserXAddressBook addUserAddress(UserXAddressBook userXAddressBook);

	public UserXAddressBook updateUserAddress(UserXAddressBook userXAddressBook);

	public void deleteUserAddress(Integer user_x_address_sid);
	
}
