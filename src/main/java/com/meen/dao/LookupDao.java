package com.meen.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meen.model.Lookup;

@Repository
public interface LookupDao extends CrudRepository<Lookup, Integer>{

	@Query("SELECT l FROM Lookup l WHERE l.lookupDomainCode = ?1 AND l.oprtlnFlag = 'A'")
	Iterable<Lookup> fetchLookup(String lookupDomainCode);

}
