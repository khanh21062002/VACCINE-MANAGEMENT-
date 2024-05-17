package com.vaccinmanagement.backend.transformers;


import com.vaccinmanagement.backend.DTO.RequestDTO.AddEmployeeDTO;
import com.vaccinmanagement.backend.DTO.ResponseDTO.EmployeeDTO;
import com.vaccinmanagement.backend.entity.Employee;

public class EmployeeTransformer {
    public static EmployeeDTO employeeToEmployeeDTO(Employee employee) {
        EmployeeDTO employeeDTO = EmployeeDTO.builder()
                .employeeId(employee.getEmployeeId())
                .employeeName(employee.getEmployeeName())
                .employeeEmail(employee.getEmployeeEmail())
                .workingPlace(employee.getWorkingPlace())
                .position(employee.getPosition())
                .build();
        return employeeDTO;
    }

    public static Employee employeeDTOToEmployee(AddEmployeeDTO addEmployeeDTO) {
        Employee employee = Employee.builder()
                .employeeId(addEmployeeDTO.getEmployeeId())
                .employeeName(addEmployeeDTO.getEmployeeName())
                .dateOfBirth(addEmployeeDTO.getDateOfBirth())
                .gender(addEmployeeDTO.getGender())
                .phoneNumber(addEmployeeDTO.getPhoneNumber())
                .addressEmployee(addEmployeeDTO.getAddressEmployee())
                .employeeEmail(addEmployeeDTO.getEmployeeEmail())
                .workingPlace(addEmployeeDTO.getWorkingPlace())
                .position(addEmployeeDTO.getPosition())
                .employeeImage(addEmployeeDTO.getEmployeeImage())
                .build();
        return employee;
    }
}
