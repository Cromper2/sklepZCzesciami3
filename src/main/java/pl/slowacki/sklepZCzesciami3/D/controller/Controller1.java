package pl.slowacki.sklepZCzesciami3.D.controller;

import org.springframework.web.bind.annotation.*;
import pl.slowacki.sklepZCzesciami3.D.controller.*;
import pl.slowacki.sklepZCzesciami3.D.dto.Processor;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller1 {

    private Map<String, Processor> processors = new HashMap<>();

    @GetMapping("/hello")
    public String hello(){
        return "<h1 style = color: green; font-size: 50px;'>Hello, welcome in our computer shop!</h1>";
    }

    @PostMapping("/processorsadd")
    public String addProcessor(@RequestBody Processor processor)
    {
        processors.put(processor.getName(), processor);
        return "Added processor named: " + processor.getName();
    }
}
