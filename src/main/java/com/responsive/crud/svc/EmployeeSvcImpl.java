package com.responsive.crud.svc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.responsive.crud.domain.Employee;
import com.responsive.crud.repository.EmployeeRepository;

@Component
public class EmployeeSvcImpl implements EmployeeSvc {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        Employee employee = employeeRepository.findById(id).get();
        if (employee != null) {
            employeeRepository.delete(employee);
        }
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(name -> {
            employeeList.add(name);
        });
        return employeeList;
    }

}
