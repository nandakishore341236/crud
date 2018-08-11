package com.responsive.crud.svc;

import java.util.List;

import com.responsive.crud.domain.Employee;

public interface EmployeeSvc {
    
    public Employee saveEmployee(Employee employee);
    
    public void deleteEmployee(long id);
    
    public List<Employee> getEmployees();

}
