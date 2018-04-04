package com.levelp.spring.dao.consumer;

import com.levelp.spring.model.Consumer;

import java.util.List;

public interface ConsumerDAO {
    int add(Consumer consumer);

    int remove(int id);

    int update(Consumer consumer);

    Consumer get(int id);

    List<Consumer> list();
}
