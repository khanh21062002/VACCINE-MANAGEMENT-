package com.vaccinmanagement.backend.services;

import com.vaccinmanagement.backend.DTO.RequestDTO.AddEmployeeDTO;
import com.vaccinmanagement.backend.DTO.RequestDTO.UpdateEmployeeDTO;
import com.vaccinmanagement.backend.DTO.ResponseDTO.EmployeeDTO;
import com.vaccinmanagement.backend.Repositories.EmployeeRepository;
import com.vaccinmanagement.backend.entity.Employee;
import com.vaccinmanagement.backend.transformers.EmployeeTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() throws Exception {
        return employeeRepository.findAll();
    }
    public void saveEmployee(Employee employee)  {
        this.employeeRepository.save(employee);
    }
    public void deleteEmployee(int employee_id) {
        this.employeeRepository.deleteById(employee_id);
    }

    public EmployeeDTO getEmployeeById(Integer employee_id) throws Exception {
        Optional<EmployeeDTO> employeeOpt = employeeRepository.findByEmployeeId(employee_id);

        if (employeeOpt.isEmpty()){
            throw new Exception("Employee not found");
        }
        return employeeOpt.get();
    }

    public EmployeeDTO getEmployeeByEmail(String email_employee) throws Exception {
        Optional<EmployeeDTO> employeeOpt = employeeRepository.findByEmailEmployee(email_employee);
        if (employeeOpt.isEmpty()){
            throw new Exception("Employee not found");
        }
        return employeeOpt.get();
    }

//    public Employee getEmployeeByGender(Gender gender) throws Exception {
//        Optional<Employee> employeeOpt = employeeRepository.findByGender(gender);
//        if (employeeOpt.)
//    }

    public String addEmployee(AddEmployeeDTO employeeDTO) throws Exception {
//        Employee employee = new Employee();
        Employee employee = EmployeeTransformer.employeeDTOToEmployee(employeeDTO);
        if (employeeRepository.existsById(employeeDTO.getEmployee_id())){
            throw new Exception("Employee already exists");
        }
        if(employeeDTO.getEmail_employee() == null){
            throw new Exception("Email employee is null");
        }
        employeeRepository.save(employee);
        return "Employee has been added successfully";
    }

    public String updateEmployee(UpdateEmployeeDTO updateEmployeeDTO) throws Exception {
        Integer employeeId = updateEmployeeDTO.getEmployee_id();
        Optional<Employee> employeeOpt = employeeRepository.findById(employeeId);
        if (employeeOpt.isEmpty()){
            throw new Exception("Employee not found");
        }

        Employee employee = employeeOpt.get();
        employee.setPhone_number(updateEmployeeDTO.getPhone_number());
        employee.setEmail_employee(updateEmployeeDTO.getEmail_employee());
        employee.setAddress_employee(updateEmployeeDTO.getAddress_employee());
        employee.setWorking_place(updateEmployeeDTO.getWorking_place_employee());
        employee.setPosition(updateEmployeeDTO.getPosition());
        employeeRepository.save(employee);
        return "Employee has been updated successfully";
    }

    public String deleteEmployeeById(Integer employee_id) throws Exception {
        Optional<Employee> employeeOpt = employeeRepository.findById(employee_id);
        if (employeeOpt.isEmpty()){
            throw new Exception("Employee not found");
        }
        else {
            employeeRepository.deleteById(employee_id);
        }
        return "Employee has been deleted successfully";
    }

}
