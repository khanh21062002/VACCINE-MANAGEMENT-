package com.vaccinmanagement.backend.Repositories;

import com.vaccinmanagement.backend.entity.Employee;
import com.vaccinmanagement.backend.enums.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//    public Employee findByEmployeeId(int employee_id);

//    public Employee findByEmployeeName(String employee_name);

    public Optional<Employee> findByGender(Gender gender);

    public Optional<Employee> findByEmailEmployee(String email_employee);

}