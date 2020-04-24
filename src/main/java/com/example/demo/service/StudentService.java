package com.example.demo.service;

import com.example.demo.convertor.PersonConverter;
import com.example.demo.convertor.StudentMapper;
import com.example.demo.dto.PersonDto;
import com.example.demo.dto.StudentDto;
import com.example.demo.model.PersonEntity;
import com.example.demo.model.StudentEntity;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    UserRepository userRepository;

    public StudentDto getStudent(){

        List<User> user = userRepository.findAll();

        StudentMapper mapper = StudentMapper.MAPPER;
        //StudentDto student = StudentDto.builder().id(12).name("Peter").build();
        StudentEntity e = mapper.toStudent(StudentDto.builder().id(12).name("Peter").build());
        StudentDto student = mapper.fromStudent(e);

//        PersonConverter converter = Mappers.getMapper(PersonConverter.class) ;
//        PersonEntity person = new PersonEntity("Samuel", "Jackson", "0123 334466", LocalDate.of(1948, 12, 21));
//        PersonDto personDto = converter.convertToDto(person);
//        PersonEntity personModel = converter.convertToModel(personDto);

        return student;
    }
}
