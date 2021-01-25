package com.rest.demo.controller;

import com.rest.demo.bean.Greeting;
import com.rest.demo.business.GreetingBusiness;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    final GreetingBusiness business;

    public GreetingController() {
        business = new GreetingBusiness();
    }

    @GetMapping(value = "/greeting")
    public Greeting greeting() {
        return business.badGreeting();
    }

    @GetMapping(value = "/greeting/{name}/{auteur}")
    public Greeting greeting(@PathVariable("name") String name, @PathVariable("auteur") String auteur) {
        return business.greeting(name, auteur);
    }
}
