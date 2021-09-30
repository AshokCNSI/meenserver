package com.meen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.meen.response.model.NotificationResponse;
import com.meen.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService{
	
	@Autowired
    private JdbcTemplate jdbcTemplate; 
	
	@Override
	public Iterable<NotificationResponse> getCustomerNotifications(String latitude, String longitude) {
		// TODO Auto-generated method stub
		String sql = "SELECT     u.first_name,     u.last_name,     u.org_name,     u.org_latitude,     u.org_longitude,     u.opening_time,     u.closing_time,     u.org_logo,     u.rating,     111.111 * DEGREES(ACOS(LEAST(1.0,                             COS(RADIANS("+latitude+")) * COS(RADIANS(u.org_latitude)) * COS(RADIANS("+longitude+" - u.org_longitude)) + SIN(RADIANS(u.org_latitude)) * SIN(RADIANS("+latitude+"))))) AS distance_in_km FROM     item i,     category_x_items ci,     seller_x_item si,     users u WHERE  si.user_sid = u.user_sid         AND u.oprtln_flag = 'A'         AND u.lock_flag <> 'Y'         AND si.discount_flag = 'Y'         AND si.available_flag = 'Y'         AND si.oprtln_flag = 'A'         AND si.category_x_items_cid = ci.category_x_items_cid         AND ci.item_cid = i.item_cid         AND ci.oprtln_flag = 'A'         AND i.oprtln_flag = 'A' HAVING distance_in_km < 5 ORDER BY distance_in_km DESC ";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(NotificationResponse.class));
	}

}
