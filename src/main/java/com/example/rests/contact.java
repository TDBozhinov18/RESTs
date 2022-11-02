package com.example.rests;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class contact {

    @GetMapping("/contact")
    public String info(){
        return "email address: TDBozhinov18@codingburgas.bg";
    }
}