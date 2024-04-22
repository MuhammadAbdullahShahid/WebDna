package com.example.webDna.controller.filter;


import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth/hello")
@RequiredArgsConstructor

public class Hello {

    @PostMapping("/abc")
    public String hello(){
        return "Abdullah";
    }
}
