package com.meen.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meen.model.Banner;

@Repository
public interface BannerDao extends CrudRepository<Banner, Integer>{

}
