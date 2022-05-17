package com.example.ProjectLicence.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@RestController
@RequestMapping(path = "/api")
@RequestScope
@Validated
public class TestController {
    @PostMapping(name = "test-endpoint", path = "/test")
    public Boolean test(@Valid @Pattern(regexp = "[0-9]{2}-[A-Z]{1,3}-[0-9]{2,4}", message = "Plate pattern must be DD-SSS-DDDD")
                        @RequestParam String plate) {
        System.out.println(plate);
        return true;
    }

}

