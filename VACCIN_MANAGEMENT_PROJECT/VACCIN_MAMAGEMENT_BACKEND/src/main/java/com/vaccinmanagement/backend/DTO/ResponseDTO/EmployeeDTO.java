package com.vaccinmanagement.backend.DTO.ResponseDTO;

import com.vaccinmanagement.backend.enums.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private int employee_id;
    private String employee_name;
    private String email_employee;
    private String working_place;
    private Position position;
}
