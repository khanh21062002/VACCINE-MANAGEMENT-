package com.vaccinmanagement.backend.DTO.RequestDTO;

import com.vaccinmanagement.backend.enums.Gender;
import com.vaccinmanagement.backend.enums.Position;
import lombok.Data;

import java.util.Date;

@Data
public class UpdateEmployeeDTO {
    private int employee_id;
    private String phone_number;
    private String address_employee;
    private String email_employee;
    private String working_place_employee;
    private Position position;
    private String employee_image;
}
