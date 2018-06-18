package com.plants.serviceImpl;

import com.plants.dao.CityDao;
import com.plants.entity.City;
import com.plants.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public void save(City city) {
        cityDao.save(city);
    }

    @Override
    public void delete(int id) {
        cityDao.delete(id);
    }

    @Override
    public void update(City city) {
        cityDao.save(city);
    }

    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }

    @Override
    public City findOne(int id) {
        return cityDao.findOne(id);
    }
}
