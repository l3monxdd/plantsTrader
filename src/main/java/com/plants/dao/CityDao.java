package com.plants.dao;

import com.plants.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {
}
