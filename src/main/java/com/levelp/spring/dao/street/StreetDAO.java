package com.levelp.spring.dao.street;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Street;

import java.util.List;


public interface StreetDAO {
    int add(Street street);

    int remove(int id);

    int update(Street street);

    Street get(int id);

    List<Street> list();
}
