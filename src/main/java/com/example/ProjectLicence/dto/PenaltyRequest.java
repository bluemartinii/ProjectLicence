package com.example.ProjectLicence.dto;

import lombok.Data;

import java.util.List;

@Data
public class PenaltyRequest {
    private String plate;
    private Integer penaltyAmount;
    private List<Long> ids;

}
