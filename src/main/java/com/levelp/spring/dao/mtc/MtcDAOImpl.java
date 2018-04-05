package com.levelp.spring.dao.mtc;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Mtc;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MtcDAOImpl implements MtcDAO {

    private final SessionFactory factory;

    @Autowired
    public MtcDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public int add(Mtc mtc) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Mtc mtc) {
        return 0;
    }

    @Override
    public Mtc get(int id) {
        return null;
    }

    @Override
    public List<Mtc> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Mtc";

        List<Mtc> list = session.createQuery(hql).list();
        return list;
    }
}
