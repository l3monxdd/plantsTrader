package com.plants.controller;

import com.plants.entity.Street;
import com.plants.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StreetController {

    @Autowired
    private StreetService streetService;

    @GetMapping("/street")
    public List<Street> load() {

        return streetService.findAll();
    }

    @PostMapping("/street")
    public List<Street> saveStreet(@RequestBody Street street) {

        streetService.save(street);

        return streetService.findAll();
    }

    @DeleteMapping("/street/{id}")
    public List<Street> deleteCity(@RequestBody String idStreet) {

        streetService.delete(Integer.valueOf(idStreet));

        return streetService.findAll();
    }
}
