package com.vaccinmanagement.backend.transformers;


import com.vaccinmanagement.backend.DTO.RequestDTO.AddEmployeeDTO;
import com.vaccinmanagement.backend.DTO.ResponseDTO.EmployeeDTO;
import com.vaccinmanagement.backend.entity.Employee;

public class EmployeeTransformer {
    public static EmployeeDTO employeeToEmployeeDTO(Employee employee) {
        EmployeeDTO employeeDTO = EmployeeDTO.builder()
                .employee_id(employee.getEmployee_id())
                .employee_name(employee.getEmployee_name())
                .email_employee(employee.getEmail_employee())
                .working_place(employee.getWorking_place())
                .position(employee.getPosition())
                .build();
        return employeeDTO;
    }

    public static Employee employeeDTOToEmployee(AddEmployeeDTO employeeDTO) {
        Employee employee = Employee.builder()
                .employee_id(employeeDTO.getEmployee_id())
                .employee_name(employeeDTO.getEmployee_name())
                .email_employee(employeeDTO.getEmail_employee())
                .working_place(employeeDTO.getWorking_place_employee())
                .position(employeeDTO.getPosition())
                .build();
        return employee;
    }
}
