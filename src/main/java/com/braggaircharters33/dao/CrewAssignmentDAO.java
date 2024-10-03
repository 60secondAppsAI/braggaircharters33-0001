package com.braggaircharters33.dao;

import java.util.List;

import com.braggaircharters33.dao.GenericDAO;
import com.braggaircharters33.domain.CrewAssignment;





public interface CrewAssignmentDAO extends GenericDAO<CrewAssignment, Integer> {
  
	List<CrewAssignment> findAll();
	






}


