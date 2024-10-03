package com.braggaircharters33.dao;

import java.util.List;

import com.braggaircharters33.dao.GenericDAO;
import com.braggaircharters33.domain.Reservation;





public interface ReservationDAO extends GenericDAO<Reservation, Integer> {
  
	List<Reservation> findAll();
	






}


