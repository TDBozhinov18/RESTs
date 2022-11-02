package com.example.rests;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class user {

    @GetMapping("/user")
    public String info(){
        return "Todor Bojinov";
    }
}