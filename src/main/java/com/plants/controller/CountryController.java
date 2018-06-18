package com.plants.controller;

import com.plants.entity.Country;
import com.plants.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public String country(Model model) {
        model.addAttribute("countries", countryService.findAll());
        return "country";
    }

    @PostMapping("/country")
    public String country(@RequestParam String name) {
        Country country = new Country();
        country.setName(name);
        countryService.save(country);
        return "redirect:/country";
    }

    @GetMapping("/deleteCountry/{id}")
    public String deleteCountry(@PathVariable int id){
        countryService.delete(id);
        return "redirect:/country";
    }

    @GetMapping("/updateCountry/{id}")
    public String updateCountry(@PathVariable int id, Model model){
        model.addAttribute("country", countryService.findOne(id));
        return "updateCountry";
    }

    @PostMapping("/updateCountry/{id}")
    public String updateCountry(@PathVariable int id, @RequestParam String name){
        Country country = countryService.findOne(id);
        country.setName(name);
        countryService.update(country);
        return "redirect:/country";
    }
}
