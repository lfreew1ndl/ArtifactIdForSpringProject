package com.levelp.spring.dao.city;

import com.levelp.spring.model.City;
import com.levelp.spring.model.Consumer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CityDAOImpl implements CityDAO {

    private final SessionFactory factory;

    @Autowired
    public CityDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public int add(City city) {
        return 0;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int update(City city) {
        return 0;
    }

    @Override
    public City get(int id) {
        return null;
    }

    @Override
    public List<City> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        String hql = "FROM City";

        List<City> list = session.createQuery(hql).list();
        return list;
    }
}
