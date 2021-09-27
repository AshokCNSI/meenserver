package com.meen.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meen.model.District;

@Repository
public interface DistrictDao extends CrudRepository<District, Integer>{

}
