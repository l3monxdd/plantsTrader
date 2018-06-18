package com.plants.serviceImpl;

import com.plants.dao.StreetDao;
import com.plants.entity.Street;
import com.plants.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService{

    @Autowired
    private StreetDao streetDao;

    @Override
    public void save(Street street) {
        streetDao.save(street);
    }

    @Override
    public void delete(int id) {
        streetDao.delete(id);
    }

    @Override
    public void update(Street street) {
        streetDao.save(street);
    }

    @Override
    public List<Street> findAll() {
        return streetDao.findAll();
    }

    @Override
    public Street findOne(int id) {
        return streetDao.findOne(id);
    }
}
