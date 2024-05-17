package com.vaccinmanagement.backend.Repositories;

import com.vaccinmanagement.backend.DTO.ResponseDTO.EmployeeDTO;
import com.vaccinmanagement.backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Optional<Employee> findByEmployeeId(Integer employeeId);

    Optional<Employee> findByEmployeeEmail(String employeeEmail);

}
