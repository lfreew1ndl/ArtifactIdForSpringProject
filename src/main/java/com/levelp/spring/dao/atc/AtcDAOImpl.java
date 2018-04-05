package com.levelp.spring.dao.atc;

import com.levelp.spring.model.Atc;
import com.levelp.spring.model.Consumer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AtcDAOImpl implements AtcDAO {


    private final SessionFactory factory;

    @Autowired
    public AtcDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }


    @Override
    public int add(Atc atc) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Atc atc) {
        return 0;
    }

    @Override
    public Atc get(int id) {
        return null;
    }

    @Override
    public List<Atc> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Atc";

        List<Atc> list = session.createQuery(hql).list();
        return list;
    }
}
