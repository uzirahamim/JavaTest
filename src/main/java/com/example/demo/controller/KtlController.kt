package com.example.demo.controller

import com.example.demo.dto.PersonDto
import com.example.demo.dto.StudentDto
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

//http://localhost:8080/swagger-ui.html#/test-controller
@Api(tags = ["KotlinTest"])
@RestController
@RequestMapping(value = ["/testKotlin"])
class HtmlController {

    @ApiOperation(value = "Finds student", notes = "Multiple status values can be provided with comma seperated strings", response = StudentDto::class)
    @ApiResponses(value = [ApiResponse(code = 200, message = "successful operation", response = PersonDto::class), ApiResponse(code = 400, message = "Invalid Student ID supplied"), ApiResponse(code = 404, message = "Student not found")])
    @RequestMapping(value = ["/student2"], method = [RequestMethod.GET], produces = [MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE])
    fun getStudent(): PersonDto? {
        return null;
    }


}