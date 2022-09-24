package com.cg.farm.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.farm.entity.Complaint;
import com.cg.farm.repo.IComplaintRepo;


@Service
public class ComplaintServiceImpl implements IComplaintService{

	@Autowired
	IComplaintRepo compRepo;
	
	@Override
	public Complaint addComplaint(Complaint comp) {
		return compRepo.save(comp);
	}

	@Override
	public List<Complaint> getAllComplaint() {
		return compRepo.findAll();
	}
}
