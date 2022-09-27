package com.cg.farm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.farm.entity.Admin;


@Repository
public interface IAdminRepo extends JpaRepository<Admin,Integer>{

}
