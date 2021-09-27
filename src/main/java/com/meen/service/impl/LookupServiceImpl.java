package com.meen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meen.dao.LookupDao;
import com.meen.model.Lookup;
import com.meen.service.LookupService;

@Service
public class LookupServiceImpl implements LookupService{

	@Autowired
	LookupDao lookupDao;
	
	@Override
	public Iterable<Lookup> fetchLookup(String lookupDomainCode) {
		// TODO Auto-generated method stub
		return lookupDao.fetchLookup(lookupDomainCode);
	}

	@Override
	public Lookup updateLookup(Lookup lookup, int lookup_id) {
		// TODO Auto-generated method stub
		Lookup inActiveLoopup = new Lookup();
		inActiveLoopup.setLookupSid(lookup_id);
		inActiveLoopup.setOprtlnFlag("I");
		lookupDao.save(inActiveLoopup);
		return lookupDao.save(lookup);
	}

}
