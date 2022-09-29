package com.ishu.rest.webservice.restfulwebservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class HelloWorldController {

    // @RequestMapping(method = RequestMethod.GET, path = "/hello-World")
    @GetMapping(path = "/hello-World")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/hello-World-Bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!"); //
    }

    @GetMapping(path = "/hello-World-pathVariable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World!, %s", name));
    }
}