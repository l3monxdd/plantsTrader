package com.plants.controller;

import com.plants.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @Autowired
    private CityService cityService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/openCity")
    public String city(Model model){
        return "city";
    }

    @GetMapping("/openStreet")
    public String street(Model model ){
        return "street";
    }

//    @GetMapping("/openStage")
//    public String stage(){
//        return "stage";
//    }

    @GetMapping("/openAuthor")
    public String author(Model model){
        return "author";
    }

    @GetMapping("/openBook")
    public String book(){
        return "book";
    }
}
