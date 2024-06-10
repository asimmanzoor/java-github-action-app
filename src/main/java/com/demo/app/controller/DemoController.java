package com.demo.app.controller;

import com.library.utils.services.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @Autowired
    UtilService utilService;

    @GetMapping("/demo")
    public String demo() {
        return "Hello world from Demo App : " + utilService.getString() ;
    }
    
    @GetMapping("/demo1")
    public String Demo1() {
        String Ste = "One";
        return "Hello world from Demo App";
    }
}
