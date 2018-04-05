package com.levelp.spring.dao.calls;

import com.levelp.spring.model.Calls;
import com.levelp.spring.model.Consumer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CallsDAOImpl implements CallsDAO {


    private final SessionFactory factory;

    @Autowired
    public CallsDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public int add(Calls calls) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Calls calls) {
        return 0;
    }

    @Override
    public Calls get(int id) {
        return null;
    }

    @Override
    public List<Calls> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Calls";

        List<Calls> list = session.createQuery(hql).list();
        return list;
    }
}
