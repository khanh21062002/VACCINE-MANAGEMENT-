package com.vaccinmanagement.backend.DTO.RequestDTO;

import com.vaccinmanagement.backend.enums.Gender;
import com.vaccinmanagement.backend.enums.Position;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class AddEmployeeDTO {

    @NotBlank(message = "please input employee_id")
    private int employee_id;

    @NotBlank(message = "please input Employee Name")
    @Size(max = 255, message = "Max length is 255 char , please try again")
    private String employee_name;

    private Gender gender;

    @NotBlank(message = "please input Date of birth")
    private Date date_of_birth;

    @NotBlank(message = "please input Phone Number")
    @Size(max = 11, message = "Max length is 11 char , please try again")
    private String phone_number;

    @NotBlank(message = "please input Address Employee")
    @Size(max = 255, message = "Max length is 255 char , please try again")
    private String address_employee;

    @NotBlank(message = "please input Email Employee")
    @Size(max = 255, message = "Max length is 255 char , please try again")
    private String email_employee;

    private String working_place_employee;

    private Position position;

    private String employee_image;
}
