package com.bilgeadam.controller;
/*

    getname end point i olusturalım bizie bir isim donsun;


 */

import com.bilgeadam.entity.Demo;
import com.bilgeadam.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

///http://localhost:8080/demo1
@RestController
@RequestMapping("/demo1")
public class DemoController {


    private final DemoRepository demoRepository;

    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    ///http://localhost:8080/demo1
    @GetMapping()
    public String hello(){
        return "Hello";
    }

    //http://localhost:8080/demo1/name
    @GetMapping("/name")
    public  String getName(){
        return "Mustafa";
    }

    //http://localhost:8080/demo1/name2
    @GetMapping("/name2")
    public  String getName(String name){
        return  "<style>  .myname {color: red;}  </style> <h1 class='myname'>"+name+"</h1>";
    }

    //http://localhost:8080/demo1/list
    @GetMapping("/list")
    public List<String> getList(){
        return  List.of("Mustafa","Ali","Veli");
    }

    @GetMapping("/find-all")
    public List<Demo> findAll(){
        List<Demo> list=demoRepository.findAll();
        return list;
    }



}
