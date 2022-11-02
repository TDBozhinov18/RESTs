package com.example.rests;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class about {

    @GetMapping("/about")
    public String info(){
        return "My name is Todor <br> I am 18 years old <br> I live in Burgas, Bulgaria.";
    }
}