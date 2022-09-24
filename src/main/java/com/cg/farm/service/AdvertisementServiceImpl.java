package com.cg.farm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.farm.entity.Advertisement;
import com.cg.farm.exception.AdvertisementNotFoundException;
import com.cg.farm.repo.IAdvertisementRepo;

@Service
public class AdvertisementServiceImpl implements IAdvertisementService {
	
	@Autowired
	IAdvertisementRepo advtRepo;
	
	@Override
	public Advertisement addAdvertisement(Advertisement advt) {
		return advtRepo.save(advt);
	}


	@Override
	public Advertisement updateAdvertisement(int id, Advertisement advt) throws AdvertisementNotFoundException {
		// TODO Auto-generated method stub
		Optional<Advertisement> advtOpt = advtRepo.findById(id);
		if (advtOpt.isPresent()) {
//			Advertisement adv = advtOpt.get();
		    return advtRepo.save(advt);
		} else {
			throw new AdvertisementNotFoundException("Advertisement not found with given id: " + id);
		}
	}

	@Override
	public Advertisement deleteAdvertisement(int id) throws AdvertisementNotFoundException {
		// TODO Auto-generated method stub
		Optional<Advertisement> advtOpt = advtRepo.findById(id);
		if (advtOpt.isPresent()) {
		Advertisement adv = advtOpt.get();
			advtRepo.deleteById(id);
			return adv;
		} else {
			throw new AdvertisementNotFoundException("Advertisement not found with given id: " + id);
		}
	

	}

	@Override
	public List<Advertisement> getAllAdvertisement() {
		// TODO Auto-generated method stub
		List<Advertisement> advertisements = advtRepo.findAll();
		return advertisements;
	}

}
