package com.levelp.spring.dao.number;

import com.levelp.spring.model.Consumer;

import java.util.List;


public interface NumberDAO {
    int add(Number number);

    int remove(int id);

    int update(Number number);

    Number get(int id);

    List<Number> list();
}
