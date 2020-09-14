package com.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enrollment.model.Dependent;
import com.enrollment.model.Enrollee;
import com.enrollment.service.EnrollmentStatusService;

@RestController
public class EnrollmentStatusController {
	
	@Autowired
	private EnrollmentStatusService service;
	
	@PostMapping("/addEnrollee")
	public ResponseEntity<String> addNewEnrollee(@RequestBody Enrollee enrollee) {
		service.addEnrollee(enrollee);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
	
	@PutMapping("/modifyEnrollee")
	public ResponseEntity<String> modifyExistingEnrollee(@RequestBody Enrollee enrollee) {
		service.modifyExistingEnrollee(enrollee);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/removeEnrollee")
	public ResponseEntity<String> removeEnrollee(@RequestBody Enrollee enrollee) {
		service.removeEnrollee(enrollee);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/addDependent")
	public ResponseEntity<String> addDependentToEnrollee(@RequestBody Dependent dependent) {
		service.addDependentToEnrollee(dependent);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/removeDependent")
	public ResponseEntity<String> removeDependentFromEnrollment(@RequestBody Dependent dependent) {
		service.removeDependentFromEnrollment(dependent);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping("/modifyDependent")
	public ResponseEntity<String> modifyExistingDependent(@RequestBody Dependent dependent) {
		service.modifyExistingDependent(dependent);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
}
