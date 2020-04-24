package com.example.demo.convertor

import com.example.demo.dto.PersonDto
import com.example.demo.model.PersonEntity
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface PersonConverter {

    @Mapping(source = "phoneNumber", target = "phone")
    fun convertToDto(person: PersonEntity): PersonDto

    @InheritInverseConfiguration
    fun convertToModel(personDto: PersonDto): PersonEntity

}