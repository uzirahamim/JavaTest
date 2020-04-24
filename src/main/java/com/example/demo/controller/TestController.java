package com.example.demo.controller;

import com.example.demo.CustomRequestMapping;
import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.annotation.*;
import java.util.LinkedList;
import java.util.List;

//http://localhost:8080/swagger-ui.html#/test-controller
@Api(tags = "Student")
@RestController
@RequestMapping(value = "/test")
@Validated
public class TestController {

    @Autowired
    StudentService studentService;


    @ApiOperation(value = "Finds student",
            notes = "Multiple status values can be provided with comma seperated strings",
            response = StudentDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = StudentDto.class),
            @ApiResponse(code = 400, message = "Invalid Student ID supplied"),
            @ApiResponse(code = 404, message = "Student not found") })

    @RequestMapping(value = "/student", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public StudentDto getStudent() {
        return studentService.getStudent();
    }

    @ApiOperation(value = "Finds student",
            notes = "Multiple status values can be provided with comma seperated strings",
            response = StudentDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = StudentDto.class),
            @ApiResponse(code = 400, message = "Invalid Student ID supplied"),
            @ApiResponse(code = 404, message = "Student not found") })

    @RequestMapping(value = "/students", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public List<StudentDto> getStudents()
    {
        List<StudentDto> list = new LinkedList<>();
        list.add(StudentDto.builder().id(12).name("Peter").build());
        return list;
    }


    @RequestMapping(value = "/student", method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    //@CustomRequestMapping(path = "/student", method = RequestMethod.POST)
    public StudentDto setStudent(@Valid @RequestBody StudentDto student) {
        //StudentDto student = StudentDto.builder().id(12).name("Peter").build();
        return student;
    }


    //@Target(value = {ElementType.ANNOTATION_TYPE})
    @Target(ElementType.METHOD)
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Car {
    }
}
