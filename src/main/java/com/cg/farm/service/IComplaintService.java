package com.cg.farm.service;

import java.util.List;

import com.cg.farm.entity.Complaint;

public interface IComplaintService {

	Complaint addComplaint(Complaint comp);
	List<Complaint> getAllComplaint();
}
