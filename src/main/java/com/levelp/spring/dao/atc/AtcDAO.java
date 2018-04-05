package com.levelp.spring.dao.atc;

import com.levelp.spring.model.Atc;
import com.levelp.spring.model.Consumer;

import java.util.List;


public interface AtcDAO {
    int add(Atc atc);

    int remove(int id);

    int update(Atc atc);

    Atc get(int id);

    List<Atc> list();
}
