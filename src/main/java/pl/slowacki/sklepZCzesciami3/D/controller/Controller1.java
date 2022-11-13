package pl.slowacki.sklepZCzesciami3.D.controller;

import org.springframework.web.bind.annotation.*;
import pl.slowacki.sklepZCzesciami3.D.controller.*;

@RestController
public class Controller1 {
    @GetMapping("/hello")
    public String hello(){
        return "<h1 style = color: green; font-size: 50px;'>Hello, welcome in our computer shop!</h1>";
    }
}
