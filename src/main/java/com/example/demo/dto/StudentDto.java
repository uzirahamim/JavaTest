package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.*;

import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;



@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE) //Hides the constructor to force useage of the Builder.
@JsonRootName("student")
//@JsonPropertyOrder({"name","id"})
@ApiModel(value="student", description="Sample model for the documentation")
public class StudentDto {
    @ApiModelProperty(value = "id of student", required = false, position = 2)
    @JsonProperty("id")
    @Min(1) @Max(10000)
//    @Null(groups = OnCreate.class)
//    @NotNull(groups = OnUpdate.class)
    private long id;

    @ApiModelProperty(value = "name of student", required = true, position = 1)
    @JsonProperty("name")
    @NotNull @Size(min = 5, max = 200)
    private String name;

    @ApiModelProperty(value = "the address of student host", required = true, position = 3)
    @JsonProperty("ip-address")
    @NotNull(message="The Id is mandatory")
    @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$")
    private String ip;

    @ApiModelProperty(value = "student contact", required = false, position = 4)
    @JsonProperty("contact-info")
    ContactDto contact;
}
