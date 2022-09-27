package com.cg.farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.farm.entity.Complaint;
import com.cg.farm.service.ComplaintServiceImpl;

@RestController
public class ComplaintController {
	
	@Autowired
	ComplaintServiceImpl compServ;//creating the object of ComplaintServiceImpl
	
	//adding the complaint
	@PostMapping("/complaint/add")
	public ResponseEntity<Complaint> addComplaint(@RequestBody Complaint complaint) {
		Complaint ck =compServ.addComplaint(complaint);
		return new ResponseEntity<>(ck, HttpStatus.CREATED); 
	}
	
	//getting the list of complaint
	@GetMapping("/complaint/get/all")
	public ResponseEntity<List<Complaint>> getAllComplaint() {
		List<Complaint> comp = compServ.getAllComplaint();
		return new ResponseEntity<>(comp, HttpStatus.OK);
	}
}
