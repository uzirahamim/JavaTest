package com.example.demo;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RestController
public @interface CustomRequestMapping {
    @AliasFor(annotation = RequestMapping.class, attribute = "name")
    String name() default "";

    @AliasFor(annotation = RequestMapping.class, attribute = "path")
    String[] path() default {};

    @AliasFor(annotation = RequestMapping.class, attribute = "method")
    RequestMethod[] method() default {};

    @AliasFor(annotation = RequestMapping.class, attribute = "params")
    String[] params() default {};

    @AliasFor(annotation = RequestMapping.class, attribute = "headers")
    String[] headers() default {};

    @AliasFor(annotation = RequestMapping.class, attribute = "consumes")
    String[] consumes() default {
            MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE
    };

    @AliasFor(annotation = RequestMapping.class, attribute = "produces")
    String[] produces() default {
        MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE
    };
}
