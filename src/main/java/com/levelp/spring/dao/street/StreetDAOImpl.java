package com.levelp.spring.dao.street;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Street;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StreetDAOImpl implements StreetDAO {

    private final SessionFactory factory;

    @Autowired
    public StreetDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public int add(Street street) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Street street) {
        return 0;
    }

    @Override
    public Street get(int id) {
        return null;
    }

    @Override
    public List<Street> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Street";

        List<Street> list = session.createQuery(hql).list();
        return list;
    }
}
