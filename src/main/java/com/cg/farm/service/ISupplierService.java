package com.cg.farm.service;

import com.cg.farm.entity.Supplier;
import com.cg.farm.exception.SupplierNotFoundException;

public interface ISupplierService {

	Supplier deleteSupplier(int id) throws SupplierNotFoundException;
	Supplier updateSupplier(int id,Supplier sup) throws SupplierNotFoundException;
}
