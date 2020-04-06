package com.example.demo.controller;

import com.example.demo.CustomRequestMapping;
import com.example.demo.dto.StudentDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.*;

//http://localhost:8080/swagger-ui.html#/test-controller
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping(value = "/student", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    //@CustomRequestMapping(path = "/student", method = RequestMethod.GET)
    public StudentDto getStudent() {
        StudentDto student = StudentDto.builder().id(12).name("Peter").build();
        return student;
    }


//    @RequestMapping(value = "/student", method = RequestMethod.POST,
//            consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
//            produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
//    @CustomRequestMapping(path = "/student", method = RequestMethod.POST)
//    public StudentDto setStudent(@RequestBody StudentDto student) {
//        //StudentDto student = StudentDto.builder().id(12).name("Peter").build();
//        return student;
//    }


    //@Target(value = {ElementType.ANNOTATION_TYPE})
    @Target(ElementType.METHOD)
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Car {
    }
}
