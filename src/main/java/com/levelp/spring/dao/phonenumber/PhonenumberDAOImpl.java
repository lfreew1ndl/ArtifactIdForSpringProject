package com.levelp.spring.dao.phonenumber;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Phonenumber;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PhonenumberDAOImpl implements PhonenumberDAO {

    private final SessionFactory factory;

    @Autowired
    public PhonenumberDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public int add(Phonenumber phonenumber) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Phonenumber phonenumber) {
        return 0;
    }

    @Override
    public Phonenumber get(int id) {
        return null;
    }

    @Override
    public List<Phonenumber> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Phonenumber";

        List<Phonenumber> list = session.createQuery(hql).list();
        return list;
    }
}
