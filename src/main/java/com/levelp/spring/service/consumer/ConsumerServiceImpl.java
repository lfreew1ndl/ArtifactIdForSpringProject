package com.levelp.spring.service.consumer;

import com.levelp.spring.dao.consumer.ConsumerDAO;
import com.levelp.spring.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    ConsumerDAO dao;

    @Override
    public int add(Consumer consumer) {
        return dao.add(consumer);
    }

    @Override
    public int remove(int id) {
        return dao.remove(id);
    }

    @Override
    public int update(Consumer consumer) {
        return dao.update(consumer);
    }

    @Override
    public Consumer get(int id) {
        return dao.get(id);
    }

    @Override
    public List<Consumer> list() {
        return dao.list();
    }
}
