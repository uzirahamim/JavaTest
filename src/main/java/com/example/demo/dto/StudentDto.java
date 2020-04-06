package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonRootName("studentroot")
@JsonPropertyOrder({"name","idx"})
public class StudentDto {
    @JsonProperty("idx")
    private long id;
    @JsonProperty("name")
    private String name;
}
