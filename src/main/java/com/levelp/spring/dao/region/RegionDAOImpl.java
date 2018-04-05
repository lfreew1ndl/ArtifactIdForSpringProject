package com.levelp.spring.dao.region;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Region;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RegionDAOImpl implements RegionDAO {

    private final SessionFactory factory;

    @Autowired
    public RegionDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public int add(Region region) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(Region region) {
        return 0;
    }

    @Override
    public Region get(int id) {
        return null;
    }

    @Override
    public List<Region> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM Region";

        List<Region> list = session.createQuery(hql).list();
        return list;
    }
}
