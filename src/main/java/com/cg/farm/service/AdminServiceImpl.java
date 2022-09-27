package com.cg.farm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.farm.entity.Admin;
import com.cg.farm.entity.Advertisement;
import com.cg.farm.exception.AdminNotFoundException;
import com.cg.farm.exception.AdvertisementNotFoundException;
import com.cg.farm.repo.IAdminRepo;
import com.cg.farm.repo.IAdvertisementRepo;

@Service
public class AdminServiceImpl implements IAdminService{

	@Autowired
	IAdminRepo admRepo;
	
	@Override
	public Admin deleteAdmin(int id) throws AdminNotFoundException {
		
		Optional<Admin> advtOpt = admRepo.findById(id);
		if (advtOpt.isPresent()) {
			Admin adv = advtOpt.get();
			admRepo.deleteById(id);
			return adv;
		} else {
			throw new AdminNotFoundException("Advertisement not found with given id: " + id);
		}
	
     }
	
	@Override
	public Admin updateAdmin(int id, Admin ad) throws AdminNotFoundException {
		Optional<Admin> admin = admRepo.findById(id);

		if (admin.isPresent()) {
			Admin adm = admin.get();
			adm.setUsername(ad.getUsername());
			adm.setPwd(ad.getPwd());
		    return admRepo.save(adm);
		} else {
			throw new AdminNotFoundException("Advertisement not found with given id: " + id);
		}
	}
}
