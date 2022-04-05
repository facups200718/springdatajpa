package com.skillsoft.springdatajpa.repository;

import com.skillsoft.springdatajpa.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
}
