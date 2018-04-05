package com.levelp.spring.dao.consumer;

import com.levelp.spring.model.Consumer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConsumerDAOImpl implements ConsumerDAO {

    private final SessionFactory factory;

    @Autowired
    public ConsumerDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }
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
        String hql = "FROM Consumer";

        List<Consumer> list = session.createQuery(hql).list();
        return list;
    }
}
