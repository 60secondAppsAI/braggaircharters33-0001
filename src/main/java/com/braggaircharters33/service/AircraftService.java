package com.braggaircharters33.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggaircharters33.domain.Aircraft;
import com.braggaircharters33.dto.AircraftDTO;
import com.braggaircharters33.dto.AircraftSearchDTO;
import com.braggaircharters33.dto.AircraftPageDTO;
import com.braggaircharters33.dto.AircraftConvertCriteriaDTO;
import com.braggaircharters33.service.GenericService;
import com.braggaircharters33.dto.common.RequestDTO;
import com.braggaircharters33.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface AircraftService extends GenericService<Aircraft, Integer> {

	List<Aircraft> findAll();

	ResultDTO addAircraft(AircraftDTO aircraftDTO, RequestDTO requestDTO);

	ResultDTO updateAircraft(AircraftDTO aircraftDTO, RequestDTO requestDTO);

    Page<Aircraft> getAllAircrafts(Pageable pageable);

    Page<Aircraft> getAllAircrafts(Specification<Aircraft> spec, Pageable pageable);

	ResponseEntity<AircraftPageDTO> getAircrafts(AircraftSearchDTO aircraftSearchDTO);
	
	List<AircraftDTO> convertAircraftsToAircraftDTOs(List<Aircraft> aircrafts, AircraftConvertCriteriaDTO convertCriteria);

	AircraftDTO getAircraftDTOById(Integer aircraftId);







}





