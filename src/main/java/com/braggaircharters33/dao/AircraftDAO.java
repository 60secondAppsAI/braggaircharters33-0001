package com.braggaircharters33.dao;

import java.util.List;

import com.braggaircharters33.dao.GenericDAO;
import com.braggaircharters33.domain.Aircraft;





public interface AircraftDAO extends GenericDAO<Aircraft, Integer> {
  
	List<Aircraft> findAll();
	






}


