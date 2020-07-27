package com.jpa.springormjpa2.controller;

import com.jpa.springormjpa2.model.Employee;
import com.jpa.springormjpa2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee Saved";
    }

    @GetMapping(value="/getallemp")
    public List<Employee> getEmpList(){

        return employeeRepository.findAll();
    }

    @GetMapping(value="/getemp/{id}")
    public Optional<Employee> getEmp(@PathVariable Integer id){

        return employeeRepository.findById(id);
    }

    @GetMapping(value="/getallemp/{name}/{city}")
    public List<Employee> getEmpList1(@PathVariable String name,
                                      @PathVariable String city){
        return employeeRepository.findByNameAndCity(name,city);
    }

}

//OneToOne
//OneToMany
//ManyToOne
//ManyToMany