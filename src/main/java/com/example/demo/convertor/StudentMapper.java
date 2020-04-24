package com.example.demo.convertor;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.StudentEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring" , uses = {ContactMapper.class} )
public interface StudentMapper {

    StudentMapper MAPPER = Mappers.getMapper( StudentMapper.class );

    @Mapping(source = "name", target = "student_name")
    StudentEntity toStudent(StudentDto studentDto);

    @InheritInverseConfiguration
    StudentDto fromStudent(StudentEntity studentEntity);
}
