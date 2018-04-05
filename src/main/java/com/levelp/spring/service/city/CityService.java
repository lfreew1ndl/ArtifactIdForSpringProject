package com.levelp.spring.service.city;

import com.levelp.spring.model.City;
import com.levelp.spring.model.Consumer;

import java.util.List;


public interface CityService {
    int add(City city);

    int remove(int id);

    int update(City city);

    City get(int id);

    List<City> list();
}
