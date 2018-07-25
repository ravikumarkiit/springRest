package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

    @RequestMapping(value = "/name")
    public String index() {
        return "Greetings from Spring Boot! Ravi";
    }

    @RequestMapping(value = "/printId")
    public String print(@RequestParam("id") String id, @RequestParam("name") String name) {
        return "Greetings from Spring Boot! id "+ id + " name "+ name;
    }
    
    /*@RequestMapping(value = "/printId")
    public RestResponseEntity print(@RequestParam("id") String id, @RequestParam("name") String name) {
        return new RestResponseEntity<Void>(null, HttpStatus.OK, "Greetings from Spring Boot! id "+ id + " name "+ name);
    }*/
}