package com.example.demo.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonRootName
import io.swagger.annotations.ApiModel
import java.time.LocalDate


//Hides the constructor to force useage of the Builder.
@JsonRootName("person")
@JsonPropertyOrder("firstName", "lastName","phone","birthdate")
@ApiModel(value = "person", description = "Sample model for the documentation")
data class PersonDto(
        @JsonProperty("fname")
        var firstName: String?,
        @JsonProperty("lname")
        var lastName: String?,
        @JsonProperty("phone")
        var phone: String?,
        @JsonProperty("birthdate")
        var birthdate: LocalDate?) {

    // Necessary for MapStruct
    constructor() : this(null, null, null, null)

}