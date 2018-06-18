package com.plants.controller;

import com.plants.entity.Stage;
import com.plants.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StageController {

    @Autowired
    private StageService stageService;

    @GetMapping("/stage")
    public String stage(Model model){
        model.addAttribute("stages", stageService.findAll() );
        return "stage";
    }

    @PostMapping("/stage")
    public @ResponseBody
    List<Stage> saveStage(@RequestBody Stage stage){
        System.out.println("stage = " + stage);
        stageService.save(stage);
        return stageService.findAll() ;
    }
}
