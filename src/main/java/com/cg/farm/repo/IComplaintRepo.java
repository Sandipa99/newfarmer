package com.cg.farm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.farm.entity.Complaint;

@Repository
public interface IComplaintRepo extends JpaRepository<Complaint,Integer> {
	
	
}
