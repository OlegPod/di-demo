package com.olehpodolin.didemo.controllers;

import com.olehpodolin.didemo.services.GreetingService;
import com.olehpodolin.didemo.services.GreetingServiceImpl;


public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
