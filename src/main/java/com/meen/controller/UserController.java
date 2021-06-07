package com.meen.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meen.model.UserXAddressBook;
import com.meen.model.Users;
import com.meen.response.model.Response;
import com.meen.service.UserService;

@RestController(value = "/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/saveUser")
	public Response save(@RequestBody Users users) {
		Users userObject = userService.save(users);
		Response response = new Response();
		if(null != userObject) {
			response.setStatusID(HttpStatus.OK.value());
		} else {
			response.setStatusID(HttpStatus.NOT_FOUND.value());
		}
		return response;
	}
	
	@GetMapping("/fetchUser")
	public Users fetchUserByID(@PathVariable(value = "user_sid") String user_sid) {
		return userService.fetchUserByID(user_sid);
	}
	
	@GetMapping("/fetchUserAddress")
	public Iterable<UserXAddressBook> fetchUserAddress(@PathVariable(value = "user_sid") String user_sid) {
		return userService.fetchUserAddress(user_sid);
	}
	
	@PostMapping("/addUserAddress")
	public Response addUserAddress(@RequestBody UserXAddressBook userXAddressBook) {
		UserXAddressBook userObject = userService.addUserAddress(userXAddressBook);
		Response response = new Response();
		if(null != userObject) {
			response.setStatusID(HttpStatus.OK.value());
		} else {
			response.setStatusID(HttpStatus.NOT_FOUND.value());
		}
		return response;
	}
	
	@PostMapping("/updateUserAddress")
	public Response updateUserAddress(@RequestBody UserXAddressBook userXAddressBook) {
		UserXAddressBook userObject = userService.updateUserAddress(userXAddressBook);
		Response response = new Response();
		if(null != userObject) {
			response.setStatusID(HttpStatus.OK.value());
		} else {
			response.setStatusID(HttpStatus.NOT_FOUND.value());
		}
		return response;
	}
	
	@DeleteMapping("/deleteUserAddress")
	public Response save(@PathVariable(value = "user_x_address_sid") Integer user_x_address_sid) {
		userService.deleteUserAddress(user_x_address_sid);
		Response response = new Response();
		response.setStatusID(HttpStatus.OK.value());
		return response;
	}
}
