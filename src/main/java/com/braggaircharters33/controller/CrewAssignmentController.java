package com.braggaircharters33.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.braggaircharters33.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.braggaircharters33.domain.CrewAssignment;
import com.braggaircharters33.dto.CrewAssignmentDTO;
import com.braggaircharters33.dto.CrewAssignmentSearchDTO;
import com.braggaircharters33.dto.CrewAssignmentPageDTO;
import com.braggaircharters33.service.CrewAssignmentService;
import com.braggaircharters33.dto.common.RequestDTO;
import com.braggaircharters33.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/crewAssignment")
@RestController
public class CrewAssignmentController {

	private final static Logger logger = LoggerFactory.getLogger(CrewAssignmentController.class);

	@Autowired
	CrewAssignmentService crewAssignmentService;



	//@AllowSystem(AuthScopes.READ)
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<CrewAssignment> getAll() {

		List<CrewAssignment> crewAssignments = crewAssignmentService.findAll();
		
		return crewAssignments;	
	}

	//@ReadAccess
	@GetMapping(value = "/{crewAssignmentId}")
	@ResponseBody
	public CrewAssignmentDTO getCrewAssignment(@PathVariable Integer crewAssignmentId) {
		
		return (crewAssignmentService.getCrewAssignmentDTOById(crewAssignmentId));
	}

 	//@WriteAccess
 	@RequestMapping(value = "/addCrewAssignment", method = RequestMethod.POST)
	public ResponseEntity<?> addCrewAssignment(@RequestBody CrewAssignmentDTO crewAssignmentDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = crewAssignmentService.addCrewAssignment(crewAssignmentDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}
		
		return result.asResponseEntity();
	}

	//@ReadAccess
	@GetMapping("/crewAssignments")
	public ResponseEntity<CrewAssignmentPageDTO> getCrewAssignments(CrewAssignmentSearchDTO crewAssignmentSearchDTO) {
 
		return crewAssignmentService.getCrewAssignments(crewAssignmentSearchDTO);
	}	

 	//@WriteAccess
	@RequestMapping(value = "/updateCrewAssignment", method = RequestMethod.POST)
	public ResponseEntity<?> updateCrewAssignment(@RequestBody CrewAssignmentDTO crewAssignmentDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = crewAssignmentService.updateCrewAssignment(crewAssignmentDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
