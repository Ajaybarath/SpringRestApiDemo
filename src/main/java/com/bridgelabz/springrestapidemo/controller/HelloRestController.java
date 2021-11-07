package com.bridgelabz.springrestapidemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping(value = {"", "/"})
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloParams(@RequestParam("name") String name) {
        return "Hello " + name + "!";
    }
}
