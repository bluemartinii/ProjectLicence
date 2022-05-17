package com.example.ProjectLicence.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class PlateDto {

    @NotEmpty(message = "Plate must be required")
    private String plate;
}
