package br.com.rest.controllers;


import br.com.rest.model.Greenting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greenting greeting(@RequestParam(value = "name", defaultValue = "world") String name){
        return new Greenting(counter.incrementAndGet(), String.format(template, name));
    }
}
