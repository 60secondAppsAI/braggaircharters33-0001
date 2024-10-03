package com.braggaircharters33.dao;

import java.util.List;

import com.braggaircharters33.dao.GenericDAO;
import com.braggaircharters33.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


