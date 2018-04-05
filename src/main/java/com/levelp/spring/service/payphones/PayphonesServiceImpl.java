package com.levelp.spring.service.payphones;

import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.dao.payphones.PayphonesDAOImpl;
import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Payphones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayphonesServiceImpl implements PayphonesService {

    @Autowired
    private PayphonesDAOImpl dao;

    public int add(Payphones payphones) {
        return dao.add(payphones);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Payphones payphones) {
        return dao.update(payphones);
    }

    public Payphones get(int id) {
        return dao.get(id);
    }

    public List<Payphones> list() {
        return dao.list();
    }
}
