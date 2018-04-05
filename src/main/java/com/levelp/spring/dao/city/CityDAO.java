package com.levelp.spring.dao.city;

import com.levelp.spring.model.City;
import com.levelp.spring.model.Consumer;

import java.util.List;

public interface CityDAO {
    int add(City city);

    int remove(int id);

    int update(City city);

    City get(int id);

    List<City> list();
}