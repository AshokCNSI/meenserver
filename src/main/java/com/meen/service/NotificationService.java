package com.meen.service;

import com.meen.response.model.NotificationResponse;

public interface NotificationService {

	Iterable<NotificationResponse> getCustomerNotifications(String latitude, String longitude);

}
