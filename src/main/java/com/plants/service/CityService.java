package com.plants.service;

import com.plants.entity.City;

import java.util.List;

public interface CityService {

    void save(City city);

    void delete(int id);

    void update(City city);

    List<City> findAll();

    City findOne(int id);
}
