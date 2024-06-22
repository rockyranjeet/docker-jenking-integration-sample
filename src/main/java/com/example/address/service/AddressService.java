package com.example.address.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.address.entity.Address;
import com.example.address.entity.CreateAddressRequest;
import com.example.address.repository.AddressRepository;
import com.example.address.response.AddressResponse;

@Service
public class AddressService {

	Logger logger = LoggerFactory.getLogger(AddressService.class);

	@Autowired
	private AddressRepository addressRepository;

	public AddressResponse createAddress(CreateAddressRequest createReuest) {
		Address address = new Address();
		address.setCity(createReuest.getCity());
		address.setStreet(createReuest.getStreet());
		addressRepository.save(address);
		return new AddressResponse(address);
	}

	public AddressResponse getById(long id) {
		// TODO Auto-generated method stub
		logger.info("Inside getById " + id);
		Address address = addressRepository.getOne(id);
		return new AddressResponse(address);
	}

}
