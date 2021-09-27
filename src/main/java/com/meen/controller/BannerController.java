package com.meen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meen.model.Banner;
import com.meen.service.BannerService;

@RestController
public class BannerController {

	@Autowired
	BannerService bannerService;
	
	@GetMapping
	public Iterable<Banner> fetchAllBanner() {
		return bannerService.fetchAllBanner();
		
	}
}
