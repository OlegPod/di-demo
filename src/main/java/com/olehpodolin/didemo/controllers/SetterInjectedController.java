package com.olehpodolin.didemo.controllers;

import com.olehpodolin.didemo.services.GreetingService;
import com.olehpodolin.didemo.services.GreetingServiceImpl;


public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
