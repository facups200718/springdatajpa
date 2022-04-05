package com.skillsoft.springdatajpa;

import com.skillsoft.springdatajpa.entity.EmployeeEntity;
import com.skillsoft.springdatajpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository) {
		return (args) -> {
			//Create EmployeeEntities
			ArrayList<EmployeeEntity> employeeEntities = new ArrayList<>();
			employeeEntities.add(new EmployeeEntity("René Rivas", "renerivas@gmail.com"));
			employeeEntities.add(new EmployeeEntity("Raul Chavez", "rchavez@hotmail.com"));
			employeeEntities.add(new EmployeeEntity("Neil Peart", "neilpeart@rush.com"));
			employeeEntities.add(new EmployeeEntity("Marcello Lee", "marcellolee@gmail.com"));
			employeeRepository.saveAll(employeeEntities);
		};
	}

}
