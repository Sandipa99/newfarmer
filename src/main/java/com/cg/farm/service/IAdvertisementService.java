package com.cg.farm.service;

import java.util.List;

import com.cg.farm.entity.Advertisement;
import com.cg.farm.exception.AdvertisementNotFoundException;

public interface IAdvertisementService  {

	Advertisement addAdvertisement(Advertisement advt);
	Advertisement updateAdvertisement(int id,Advertisement advt) throws AdvertisementNotFoundException;
	Advertisement deleteAdvertisement(int id) throws AdvertisementNotFoundException; 
	List<Advertisement> getAllAdvertisement();
}
