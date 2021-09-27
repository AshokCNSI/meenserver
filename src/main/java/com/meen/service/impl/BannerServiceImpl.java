package com.meen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meen.dao.BannerDao;
import com.meen.model.Banner;
import com.meen.service.BannerService;

@Service
public class BannerServiceImpl implements BannerService{
	
	@Autowired
	BannerDao bannerDao;
	
	@Override
	public Iterable<Banner> fetchAllBanner() {
		// TODO Auto-generated method stub
		return bannerDao.findAll();
	}

}
