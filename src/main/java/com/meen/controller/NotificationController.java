package com.meen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.meen.model.Lookup;
import com.meen.response.model.NotificationResponse;
import com.meen.service.NotificationService;

@RestController
public class NotificationController {

	@Autowired
	NotificationService notificationService;
	
	@GetMapping("/fetchUserNotification/{latitude}/{longitude}")
	public Iterable<NotificationResponse> getCustomerNotifications(@PathVariable(value = "latitude") String latitude
			, @PathVariable(value = "longitude") String longitude) {
		return notificationService.getCustomerNotifications(latitude, longitude);
	}
}
