package com.cg.farm.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.cg.farm.entity.Advertisement;
import com.cg.farm.exception.AdvertisementNotFoundException;
import com.cg.farm.service.AdvertisementServiceImpl;

@RestController

public class AdvertiseController {
	
	@Autowired
	AdvertisementServiceImpl advService;//creating the object of AdvertisementServiceImpl
	

	//getting all the details of Advertisement
	@GetMapping("/getall")
	ResponseEntity<List<Advertisement>> getAllAdvertisement() {
		//getting the list of advertisement
		List<Advertisement> advertisements= advService.getAllAdvertisement();
		return new ResponseEntity<>(advertisements, HttpStatus.OK); // 200 ok
	}
	
	//Adding the Advertisement
	@PostMapping("/adv/add")
	ResponseEntity<Advertisement> addAdvertisement(@RequestBody Advertisement advt) {
		//adding the advertisement by passing the variable
		Advertisement newAdvt = advService.addAdvertisement(advt);
		return new ResponseEntity<>(newAdvt, HttpStatus.CREATED); // 201 created 
	}
	
	//Deleting the Advertisement
	@DeleteMapping("/adv/delete/{advId}")
	ResponseEntity<Advertisement> deleteAdvertisement(@PathVariable("advId") int advId) throws AdvertisementNotFoundException{
		//deleting the details of advertisement by passing the id 
		Advertisement adv = advService.deleteAdvertisement(advId);
		return new ResponseEntity<>(adv, HttpStatus.OK); //200 ok
	}
	
	
	

}
