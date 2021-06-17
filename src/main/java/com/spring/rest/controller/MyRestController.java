package com.spring.rest.controller;

import com.spring.rest.entity.Employee;
import com.spring.rest.exception_handling.NoSuchEmployeeException;
import com.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmloyees(){
        List<Employee> allEmployees  = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee (@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
        if(employee == null) {
            throw new NoSuchEmployeeException("There is no employee with ID = "
                    + id + " in Database");
        }
        return employee;
    }
    @PostMapping("/employees")
    public Employee addNewEmployee (@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }
    @PutMapping("/employees")
    public Employee updateEmployee (@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee (@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
        if (employee==null){
            throw new NoSuchEmployeeException("There is no employee with id = "+
                    +id+" in database");
        }
        employeeService.deleteEmployee(id);
        return "Emplee with id = "+id+" was deleted";
    }
}
