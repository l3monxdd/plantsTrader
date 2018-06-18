package com.plants.controller;

import com.plants.entity.City;
import com.plants.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

//
//    @PostMapping("/city")
//    public List<City> saveCity(@RequestBody City city){
//        cityService.save(city);
//        return cityService.findAll();
//    }
//
    @GetMapping("/city")
    public List<City> load(){
        return cityService.findAll();
    }

    @PostMapping("/city")
    public List<City> saveCity(@RequestBody City city) {

        cityService.save(city);

        return cityService.findAll();
    }

//    @GetMapping("/city")
//    public List<City> loadCities(){
//        return cityService.findAll();
//    }
}
