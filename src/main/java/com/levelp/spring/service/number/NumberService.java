package com.levelp.spring.service.number;

import com.levelp.spring.model.Consumer;

import java.util.List;


public interface NumberService {
    int add(Number number);

    int remove(int id);

    int update(Number number);

    Number get(int id);

    List<Number> list();
}
