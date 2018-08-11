package com.responsive.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.responsive.crud.domain.Employee;
import com.responsive.crud.svc.EmployeeSvc;

@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeSvc employeeSvc;
    
    @RequestMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) throws JsonProcessingException {
        return new ResponseEntity<Employee>(employeeSvc.saveEmployee(employee), HttpStatus.ACCEPTED);
    }
    
    @RequestMapping("/deleteEmployee")
    public void deleteEmployee(@RequestBody long id) {
        employeeSvc.deleteEmployee(id);
    }
    
    @RequestMapping("/getEmployees")
    public List<Employee> getEmployees() {
        return employeeSvc.getEmployees();
    }

}
