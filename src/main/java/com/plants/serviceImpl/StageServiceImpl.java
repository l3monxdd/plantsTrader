package com.plants.serviceImpl;

import com.plants.dao.StageDao;
import com.plants.entity.Stage;
import com.plants.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StageServiceImpl implements StageService{
    @Autowired
    private StageDao stageDao;

    @Override
    public void save(Stage stage) {
        stageDao.save(stage);
    }

    @Override
    public void delete(int id) {
        stageDao.delete(id);
    }

    @Override
    public void update(Stage stage) {
        stageDao.save(stage);
    }

    @Override
    public List<Stage> findAll() {
        return stageDao.findAll();
    }

    @Override
    public Stage findOne(int id) {
        return stageDao.findOne(id);
    }
}
