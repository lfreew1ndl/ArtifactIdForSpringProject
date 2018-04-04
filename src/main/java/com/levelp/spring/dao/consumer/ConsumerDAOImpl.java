package com.levelp.spring.dao.consumer;

import com.levelp.spring.model.Consumer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class ConsumerDAOImpl implements ConsumerDAO {

    @Autowired
    SessionFactory factory;


    @Override
    public int add(Consumer consumer) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Consumer consumer) {
        return 0;
    }

    @Override
    public Consumer get(int id) {
        return null;
    }

    @Override
    public List<Consumer> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        List<Consumer> list = session.createQuery("FROM Consumer").list();
        return list;
    }
}
