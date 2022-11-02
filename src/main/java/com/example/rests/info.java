package com.example.rests;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class info {

    @GetMapping()
    public String infos(){
        return "Hello World";
    }
}