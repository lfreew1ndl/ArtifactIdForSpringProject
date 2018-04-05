package com.levelp.spring.dao.phone;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Phone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PhoneDAOImpl implements PhoneDAO {

    private final SessionFactory factory;

    @Autowired
    public PhoneDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public int add(Phone phone) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Phone phone) {
        return 0;
    }

    @Override
    public Phone get(int id) {
        return null;
    }

    @Override
    public List<Phone> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Phone";

        List<Phone> list = session.createQuery(hql).list();
        return list;
    }
}
