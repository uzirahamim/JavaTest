package com.example.demo.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE) //Hides the constructor to force useage of the Builder.
@JsonRootName("contact")
@ApiModel(value="contact", description="contact information .... ")
public class ContactDto {
    @ApiModelProperty(value = "phone number of student", required = true, position = 1)
    @JsonProperty("phone-number")
    @NotNull
    @Size(min = 5, max = 200)
    private String phone;

    @ApiModelProperty(value = "email of student", required = true, position = 1)
    @JsonProperty("email")
    @NotNull @Size(min = 5, max = 200)
    private String email;
}
