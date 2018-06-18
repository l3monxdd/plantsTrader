package com.plants.service;

import com.plants.entity.Street;

import java.util.List;

public interface StreetService {

    void save(Street street);

    void delete(int id);

    void update(Street street);

    List<Street> findAll();

    Street findOne(int id);
}
