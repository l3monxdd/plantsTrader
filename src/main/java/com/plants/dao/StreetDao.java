package com.plants.dao;

import com.plants.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetDao extends JpaRepository<Street, Integer> {
}
