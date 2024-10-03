package com.braggaircharters33.dao;

import java.util.List;

import com.braggaircharters33.dao.GenericDAO;
import com.braggaircharters33.domain.Passenger;





public interface PassengerDAO extends GenericDAO<Passenger, Integer> {
  
	List<Passenger> findAll();
	






}


