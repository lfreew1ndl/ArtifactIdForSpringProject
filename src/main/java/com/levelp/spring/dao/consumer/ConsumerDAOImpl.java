package com.levelp.spring.dao.consumer;

import com.levelp.spring.model.Consumer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.util.List;

@Repository
public class ConsumerDAOImpl implements ConsumerDAO {

    private final SessionFactory factory;

    @Autowired
    public ConsumerDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Transactional
    @Override
    public int add(Consumer consumer) {
        Session session = factory.openSession();
        Serializable identifier = session.save(consumer);
        session.close();
        return (Integer) identifier;
    }

    @Transactional
    @Override
    public int remove(int id) {
        Session session = factory.openSession();
        Consumer consumer = session.load(Consumer.class,id);
        session.delete(consumer);
        Serializable identifier = session.getIdentifier(session);
        session.close();
        return (Integer) identifier;
    }

    @Transactional
    @Override
    public int update(Consumer consumer) {
        Session session = factory.openSession();
        session.update(consumer);
        Serializable identifier = session.getIdentifier(session);
        session.close();
        return (Integer) identifier;
    }
    @Override
    public Consumer get(int id) {
        Session session = factory.openSession();
        Consumer consumer = session.load(Consumer.class,id);
        session.close();
        return consumer;
    }
    @Override
    public List<Consumer> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Consumer";

        List<Consumer> list = session.createQuery(hql).list();
        session.close();
        return list;
    }
}
