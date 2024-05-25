package com.bilgeadam.controller;
/*

    getname end point i olusturalım bizie bir isim donsun;


 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

///http://localhost:8080/demo2
@RestController
@RequestMapping("/demo2")
public class DemoController2 {


    //http://localhost:8080/demo2
    @GetMapping()
    public String hello(){
        return "Demo 2 Hello";
    }

    //http://localhost:8080/demo2/name

    @GetMapping("/name")
    public  String getName(){
        return "Demo2 Mustafa";
    }






}
