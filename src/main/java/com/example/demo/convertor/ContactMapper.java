package com.example.demo.convertor;

import com.example.demo.dto.ContactDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.model.ContactEntity;
import com.example.demo.model.StudentEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface ContactMapper {

        com.example.demo.convertor.ContactMapper MAPPER = Mappers.getMapper( com.example.demo.convertor.ContactMapper.class );

        ContactEntity toContact(ContactDto contactDto);

        @InheritInverseConfiguration
        ContactDto fromContact(ContactEntity contactEntity);

}
