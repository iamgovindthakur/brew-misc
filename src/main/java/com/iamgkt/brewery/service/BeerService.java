package com.iamgkt.brewery.service;

import java.util.UUID;

import com.iamgkt.brewery.model.BeerDto;

/**
 * @author iamgovind
 *
 */
public interface BeerService {
	
	BeerDto getBeerById(UUID beerId);

}
