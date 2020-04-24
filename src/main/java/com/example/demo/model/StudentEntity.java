package com.example.demo.model;

import com.example.demo.dto.ContactDto;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;
import springfox.documentation.swagger2.mappers.LicenseMapper;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE) //Hides the constructor to force useage of the Builder.
public class StudentEntity {
    private long id;
    private String student_name;
    private ContactEntity contact;
}
