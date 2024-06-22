package com.example.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.address.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
