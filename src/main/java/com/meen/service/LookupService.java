package com.meen.service;

import com.meen.model.Lookup;

public interface LookupService {

	Iterable<Lookup> fetchLookup(String lookupDomainCode);

	Lookup updateLookup(Lookup lookup, int lookup_id);

}
