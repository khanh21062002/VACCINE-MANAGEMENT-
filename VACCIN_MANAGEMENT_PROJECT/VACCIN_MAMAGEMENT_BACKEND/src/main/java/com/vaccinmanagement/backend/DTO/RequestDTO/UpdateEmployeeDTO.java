package com.vaccinmanagement.backend.DTO.RequestDTO;

import com.vaccinmanagement.backend.enums.Gender;
import com.vaccinmanagement.backend.enums.Position;
import lombok.Data;

import java.util.Date;

@Data
public class UpdateEmployeeDTO {
    private String phoneNumber;
    private String addressEmployee;
    private String employeeEmail;
    private String workingPlace;
    private Position position;
}
