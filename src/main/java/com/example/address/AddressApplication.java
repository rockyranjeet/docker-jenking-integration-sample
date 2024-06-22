package com.example.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.address.controller", "com.example.address.service"})
public class AddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressApplication.class, args);
	}

}
