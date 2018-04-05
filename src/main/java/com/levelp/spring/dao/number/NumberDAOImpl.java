package com.levelp.spring.dao.number;

import com.levelp.spring.model.Consumer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class NumberDAOImpl implements NumberDAO {

    private final SessionFactory factory;

    @Autowired
    public NumberDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public int add(Number number) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Number number) {
        return 0;
    }

    @Override
    public Number get(int id) {
        return null;
    }

    @Override
    public List<Number> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Number";

        List<Number> list = session.createQuery(hql).list();
        return list;
    }
}
