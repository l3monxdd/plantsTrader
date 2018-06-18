package com.plants.service;

import com.plants.entity.Country;

import java.util.List;

public interface CountryService {

    void save(Country country);

    void delete(int id);

    void update(Country country);

    List<Country> findAll();

    Country findOne(int id);
}
