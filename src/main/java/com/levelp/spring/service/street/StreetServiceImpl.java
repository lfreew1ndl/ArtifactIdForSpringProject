package com.levelp.spring.service.street;

import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.dao.street.StreetDAOImpl;
import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Street;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService {

    @Autowired
    private StreetDAOImpl dao;

    public int add(Street street) {
        return dao.add(street);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Street street) {
        return dao.update(street);
    }

    public Street get(int id) {
        return dao.get(id);
    }

    public List<Street> list() {
        return dao.list();
    }
}
