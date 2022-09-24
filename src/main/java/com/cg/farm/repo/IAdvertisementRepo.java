package com.cg.farm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.farm.entity.Advertisement;

@Repository
public interface IAdvertisementRepo extends JpaRepository<Advertisement,Integer> {

}
