package com.cg.farm.service;

import com.cg.farm.entity.Admin;
import com.cg.farm.exception.AdminNotFoundException;

public interface IAdminService {

	Admin deleteAdmin(int id) throws AdminNotFoundException;
	Admin updateAdmin(int id,Admin ad) throws AdminNotFoundException;

}
