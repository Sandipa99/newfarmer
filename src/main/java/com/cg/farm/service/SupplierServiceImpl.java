package com.cg.farm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.farm.entity.Admin;
import com.cg.farm.entity.Supplier;
import com.cg.farm.exception.SupplierNotFoundException;
import com.cg.farm.repo.IAdminRepo;
import com.cg.farm.repo.ISupplierRepo;

@Service
public class SupplierServiceImpl implements ISupplierService{

	@Autowired
	ISupplierRepo supRepo;
	
	@Override
	public Supplier deleteSupplier(int id) throws SupplierNotFoundException {
		// TODO Auto-generated method stub
		Optional<Supplier> supOpt = supRepo.findById(id);
		if (supOpt.isPresent()) {
			Supplier sup = supOpt.get();
			supRepo.deleteById(id);
			return sup;
		} else {
			throw new SupplierNotFoundException("Suplier not found with given id: " + id);
		}
	}
	
	

	@Override
	public Supplier updateSupplier(int id, Supplier supl) throws SupplierNotFoundException {
		// TODO Auto-generated method stub
		Optional<Supplier > supplier  = supRepo.findById(id);

		if (supplier.isPresent()) {
			Supplier  sup = supplier .get();
			sup.setEmail(supl.getEmail());
			sup.setPhn(supl.getPhn());
			sup.setUsername(supl.getUsername());
			sup.setPwd(supl.getPwd());
		    return supRepo.save(sup);
		} else {
			throw new SupplierNotFoundException("Advertisement not found with given id: " + id);
		}
	}
}
