package com.olehpodolin.didemo.controllers;

import com.olehpodolin.didemo.services.GreetingService;
import com.olehpodolin.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
