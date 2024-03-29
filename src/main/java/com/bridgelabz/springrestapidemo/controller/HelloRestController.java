package com.bridgelabz.springrestapidemo.controller;

import com.bridgelabz.springrestapidemo.model.User;
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

    @GetMapping("/path/{name}")
    public String HelloPath(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @PostMapping("/post")
    public String postName(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }

    @PutMapping("/put/{firstName}")
    public String putName(@PathVariable("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

 }
