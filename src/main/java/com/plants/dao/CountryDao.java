package com.plants.dao;

import com.plants.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryDao extends JpaRepository<Country, Integer> {
}
