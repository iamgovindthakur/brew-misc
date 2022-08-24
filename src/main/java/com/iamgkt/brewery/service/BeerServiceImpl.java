package com.iamgkt.brewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.iamgkt.brewery.model.BeerDto;

/**
 * @author iamgovind
 *
 */

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
	}

}
