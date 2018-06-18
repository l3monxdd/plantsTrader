package com.plants.dao;

import com.plants.entity.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StageDao extends JpaRepository<Stage, Integer> {
}
