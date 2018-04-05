package com.levelp.spring.dao.payphones;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Payphones;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PayphonesDAOImpl implements PayphonesDAO {

    private final SessionFactory factory;

    @Autowired
    public PayphonesDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public int add(Payphones payphones) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Payphones payphones) {
        return 0;
    }

    @Override
    public Payphones get(int id) {
        return null;
    }

    @Override
    public List<Payphones> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Payphones";

        List<Payphones> list = session.createQuery(hql).list();
        return list;
    }
}
