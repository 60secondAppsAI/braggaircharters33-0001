package com.braggaircharters33.dao;

import java.util.List;

import com.braggaircharters33.dao.GenericDAO;
import com.braggaircharters33.domain.Crew;





public interface CrewDAO extends GenericDAO<Crew, Integer> {
  
	List<Crew> findAll();
	






}


