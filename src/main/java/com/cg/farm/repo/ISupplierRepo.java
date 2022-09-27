package com.cg.farm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.farm.entity.Supplier;


@Repository
public interface ISupplierRepo extends JpaRepository<Supplier,Integer> {

}
