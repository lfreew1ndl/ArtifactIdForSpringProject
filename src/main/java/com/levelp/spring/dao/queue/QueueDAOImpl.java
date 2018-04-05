package com.levelp.spring.dao.queue;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Queue;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class QueueDAOImpl implements QueueDAO {

    private final SessionFactory factory;

    @Autowired
    public QueueDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public int add(Queue queue) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Queue queue) {
        return 0;
    }

    @Override
    public Queue get(int id) {
        return null;
    }

    @Override
    public List<Queue> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Queue";

        List<Queue> list = session.createQuery(hql).list();
        return list;
    }
}
