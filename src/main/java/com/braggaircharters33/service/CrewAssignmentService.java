package com.braggaircharters33.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggaircharters33.domain.CrewAssignment;
import com.braggaircharters33.dto.CrewAssignmentDTO;
import com.braggaircharters33.dto.CrewAssignmentSearchDTO;
import com.braggaircharters33.dto.CrewAssignmentPageDTO;
import com.braggaircharters33.dto.CrewAssignmentConvertCriteriaDTO;
import com.braggaircharters33.service.GenericService;
import com.braggaircharters33.dto.common.RequestDTO;
import com.braggaircharters33.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CrewAssignmentService extends GenericService<CrewAssignment, Integer> {

	List<CrewAssignment> findAll();

	ResultDTO addCrewAssignment(CrewAssignmentDTO crewAssignmentDTO, RequestDTO requestDTO);

	ResultDTO updateCrewAssignment(CrewAssignmentDTO crewAssignmentDTO, RequestDTO requestDTO);

    Page<CrewAssignment> getAllCrewAssignments(Pageable pageable);

    Page<CrewAssignment> getAllCrewAssignments(Specification<CrewAssignment> spec, Pageable pageable);

	ResponseEntity<CrewAssignmentPageDTO> getCrewAssignments(CrewAssignmentSearchDTO crewAssignmentSearchDTO);
	
	List<CrewAssignmentDTO> convertCrewAssignmentsToCrewAssignmentDTOs(List<CrewAssignment> crewAssignments, CrewAssignmentConvertCriteriaDTO convertCriteria);

	CrewAssignmentDTO getCrewAssignmentDTOById(Integer crewAssignmentId);







}





