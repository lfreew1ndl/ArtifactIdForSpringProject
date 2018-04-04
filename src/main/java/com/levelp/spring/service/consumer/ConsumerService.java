package com.levelp.spring.service.consumer;

import com.levelp.spring.model.Consumer;

import java.util.List;

public interface ConsumerService {
    int add(Consumer consumer);

    int remove(int id);

    int update(Consumer consumer);

    Consumer get(int id);

    List<Consumer> list();
}
