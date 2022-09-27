package com.cg.farm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.farm.entity.Admin;
import com.cg.farm.exception.AdminNotFoundException;
import com.cg.farm.service.AdminServiceImpl;


@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminServiceImpl admService;//creating the object of AdminServiceImpl
	
	//deleting admin details 
	@DeleteMapping("/delete/{admId}")
	ResponseEntity<Admin> deleteAdmin(@PathVariable("admId") int admId) throws AdminNotFoundException{
		//deleting the details of admin by passing the id 
		Admin adm = admService.deleteAdmin(admId);
		return new ResponseEntity<>(adm, HttpStatus.OK); //200 ok
	}
	
	//updating admin details 
	@PutMapping("/update/{admId}")
	ResponseEntity<Admin> updateAdmin(@PathVariable("admId") int admId, @RequestBody Admin adm) throws AdminNotFoundException {
		//updating the details of admin with the updated values
		Admin updatedAdm = admService.updateAdmin(admId, adm);
		return new ResponseEntity<>(updatedAdm, HttpStatus.OK); // 200 Ok
	}
}
