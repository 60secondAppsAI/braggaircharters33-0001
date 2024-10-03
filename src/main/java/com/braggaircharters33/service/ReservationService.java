package com.braggaircharters33.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggaircharters33.domain.Reservation;
import com.braggaircharters33.dto.ReservationDTO;
import com.braggaircharters33.dto.ReservationSearchDTO;
import com.braggaircharters33.dto.ReservationPageDTO;
import com.braggaircharters33.dto.ReservationConvertCriteriaDTO;
import com.braggaircharters33.service.GenericService;
import com.braggaircharters33.dto.common.RequestDTO;
import com.braggaircharters33.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ReservationService extends GenericService<Reservation, Integer> {

	List<Reservation> findAll();

	ResultDTO addReservation(ReservationDTO reservationDTO, RequestDTO requestDTO);

	ResultDTO updateReservation(ReservationDTO reservationDTO, RequestDTO requestDTO);

    Page<Reservation> getAllReservations(Pageable pageable);

    Page<Reservation> getAllReservations(Specification<Reservation> spec, Pageable pageable);

	ResponseEntity<ReservationPageDTO> getReservations(ReservationSearchDTO reservationSearchDTO);
	
	List<ReservationDTO> convertReservationsToReservationDTOs(List<Reservation> reservations, ReservationConvertCriteriaDTO convertCriteria);

	ReservationDTO getReservationDTOById(Integer reservationId);







}





