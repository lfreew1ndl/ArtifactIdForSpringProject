package com.levelp.spring.service.atc;

import com.levelp.spring.dao.atc.AtcDAOImpl;
import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.model.Atc;
import com.levelp.spring.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtcServiceImpl implements AtcService {

    @Autowired
    private AtcDAOImpl dao;

    public int add(Atc atc) {
        return dao.add(atc);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Atc atc) {
        return dao.update(atc);
    }

    public Atc get(int id) {
        return dao.get(id);
    }

    public List<Atc> list() {
        return dao.list();
    }
}
