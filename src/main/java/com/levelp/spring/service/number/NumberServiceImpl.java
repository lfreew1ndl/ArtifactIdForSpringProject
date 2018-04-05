package com.levelp.spring.service.number;

import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.dao.number.NumberDAOImpl;
import com.levelp.spring.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberServiceImpl implements NumberService {

    @Autowired
    private NumberDAOImpl dao;

    public int add(Number number) {
        return dao.add(number);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Number number) {
        return dao.update(number);
    }

    public Number get(int id) {
        return dao.get(id);
    }

    public List<Number> list() {
        return dao.list();
    }
}
