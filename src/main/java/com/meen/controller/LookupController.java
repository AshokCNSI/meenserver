package com.meen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meen.model.Lookup;
import com.meen.service.LookupService;

@RestController
public class LookupController {

	@Autowired
	LookupService lookupService;
	
	public Iterable<Lookup> fetchLookup(@PathVariable(value = "lookupDomainCode") String lookupDomainCode) {
		return lookupService.fetchLookup(lookupDomainCode);
	}
	
	public Lookup updateLookup(@RequestBody Lookup lookup,
	        @PathVariable int lookup_id) {
		return lookupService.updateLookup(lookup, lookup_id);
	}
}
