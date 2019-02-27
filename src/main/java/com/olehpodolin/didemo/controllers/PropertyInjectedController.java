package com.olehpodolin.didemo.controllers;

import com.olehpodolin.didemo.services.GreetingServiceImpl;



public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
