package com.braggaircharters33.dao;

import java.util.List;

import com.braggaircharters33.dao.GenericDAO;
import com.braggaircharters33.domain.Flight;





public interface FlightDAO extends GenericDAO<Flight, Integer> {
  
	List<Flight> findAll();
	






}


