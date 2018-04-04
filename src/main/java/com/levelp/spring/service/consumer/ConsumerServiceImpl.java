package com.levelp.spring.service.consumer;

import com.levelp.spring.dao.consumer.ConsumerDAO;
import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ConsumerDAOImpl dao;

    public int add(Consumer consumer) {
        return dao.add(consumer);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Consumer consumer) {
        return dao.update(consumer);
    }

    public Consumer get(int id) {
        return dao.get(id);
    }

    public List<Consumer> list() {
        return dao.list();
    }
}
