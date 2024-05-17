package com.vaccinmanagement.backend.services;

import com.vaccinmanagement.backend.DTO.RequestDTO.AddEmployeeDTO;
import com.vaccinmanagement.backend.DTO.RequestDTO.UpdateEmployeeDTO;
import com.vaccinmanagement.backend.Repositories.EmployeeRepository;
import com.vaccinmanagement.backend.entity.Employee;
import com.vaccinmanagement.backend.transformers.EmployeeTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployees() throws Exception {
        return employeeRepository.findAll();
    }
//    public void saveEmployee(Employee employee)  {
//        this.employeeRepository.save(employee);
//    }
//    public void deleteEmployee(int employee_id) {
//        this.employeeRepository.deleteById(employee_id);
//    }

    public Employee getEmployeeById(Integer employeeId) throws Exception {
        Optional<Employee> employeeOpt = employeeRepository.findByEmployeeId(employeeId);

        if (employeeOpt.isEmpty()){
            throw new Exception("Employee not found");
        }
        return employeeOpt.get();
    }

    public Employee getEmployeeByEmail(String emailEmployee) throws Exception {
        Optional<Employee> employeeOpt = employeeRepository.findByEmployeeEmail(emailEmployee);
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
        if (employeeRepository.existsById(employeeDTO.getEmployeeId())){
            throw new Exception("Employee already exists");
        }
        if(employeeDTO.getEmployeeEmail() == null){
            throw new Exception("Email employee is null");
        }

        employeeRepository.save(employee);
        return "Employee has been added successfully";
    }

    public String updateEmployeeById(Integer employeeId, @RequestBody UpdateEmployeeDTO updateEmployeeDTO) throws Exception {
            Optional<Employee> employeeOpt = employeeRepository.findById(employeeId);
            if (employeeOpt.isEmpty()) {
                throw new Exception("Employee not found");
            }

            Employee employee = employeeOpt.get();
            employee.setPhoneNumber(updateEmployeeDTO.getPhoneNumber());
            employee.setEmployeeEmail(updateEmployeeDTO.getEmployeeEmail());
            employee.setAddressEmployee(updateEmployeeDTO.getAddressEmployee());
            employee.setWorkingPlace(updateEmployeeDTO.getWorkingPlace());
            employee.setPosition(updateEmployeeDTO.getPosition());
            employeeRepository.save(employee);

            return "Employee has been updated successfully";

    }

    public String deleteEmployeeById(Integer employeeId) throws Exception {
        Optional<Employee> employeeOpt = employeeRepository.findById(employeeId);
        if (employeeOpt.isEmpty()){
            throw new Exception("Employee not found");
        }
        else {
            employeeRepository.deleteById(employeeId);
        }
        return "Employee has been deleted successfully";
    }

}
