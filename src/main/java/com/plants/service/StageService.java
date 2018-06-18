package com.plants.service;

import com.plants.entity.Stage;

import java.util.List;

public interface StageService {

    void save(Stage stage);

    void delete(int id);

    void update(Stage stage);

    List<Stage>findAll();

    Stage findOne(int id);
}
