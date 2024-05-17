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
    private Integer employeeId;
    private String employeeName;
    private String employeeEmail;
    private String workingPlace;
    private Position position;
}
