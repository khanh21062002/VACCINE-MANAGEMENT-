package com.vaccinmanagement.backend.controller;

import com.vaccinmanagement.backend.DTO.RequestDTO.AddEmployeeDTO;
import com.vaccinmanagement.backend.DTO.RequestDTO.UpdateEmployeeDTO;
import com.vaccinmanagement.backend.DTO.ResponseDTO.EmployeeDTO;
import com.vaccinmanagement.backend.entity.Employee;
import com.vaccinmanagement.backend.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addNewEmployee")
    public String addNewEmployee(@RequestBody AddEmployeeDTO addEmployeeDTO) {
        try {
            return employeeService.addEmployee(addEmployeeDTO);
        }
        catch (Exception e) {
            return e.getMessage();
        }
    }
    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        try{
            List<Employee> employees = new ArrayList<>();

            if (employees.isEmpty()){
                return new ResponseEntity<>(employees, HttpStatus.NO_CONTENT);
            }
            else{
                return new ResponseEntity<>(employees, HttpStatus.OK);
            }
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getEmployeeById/{employeeId}")
    public ResponseEntity<String> getEmployeeById(@PathVariable Integer employeeId) {
        try {
            EmployeeDTO employeeDTO = employeeService.getEmployeeById(employeeId);
            return new ResponseEntity<String>(employeeDTO.getEmployee_name(), HttpStatus.FOUND);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getEmployeeByEmail/{email_employee}")
    public ResponseEntity<String> getEmployeeByEmail(@PathVariable String email_employee) {
        try {
            EmployeeDTO employeeDTO = employeeService.getEmployeeByEmail(email_employee);
            return new ResponseEntity<>(employeeDTO.getEmployee_name(), HttpStatus.FOUND);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<String> updateEmployee(@RequestBody UpdateEmployeeDTO updateEmployeeDTO) {
        try {
            String result = employeeService.updateEmployee(updateEmployeeDTO);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteEmployeeById/{employeeId}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Integer employeeId) {
        try{
            String result = employeeService.deleteEmployeeById(employeeId);
            return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
