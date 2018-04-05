package com.levelp.spring.service.city;

import com.levelp.spring.dao.city.CityDAOImpl;
import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.model.City;
import com.levelp.spring.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDAOImpl dao;

    public int add(City city) {
        return dao.add(city);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(City city) {
        return dao.update(city);
    }

    public City get(int id) {
        return dao.get(id);
    }

    public List<City> list() {
        return dao.list();
    }
}
