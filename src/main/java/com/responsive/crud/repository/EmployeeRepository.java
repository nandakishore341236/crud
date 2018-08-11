package com.responsive.crud.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.responsive.crud.domain.Employee;

@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
