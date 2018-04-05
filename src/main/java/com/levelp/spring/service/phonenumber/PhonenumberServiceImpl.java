package com.levelp.spring.service.phonenumber;

import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.dao.phone.PhoneDAO;
import com.levelp.spring.dao.phonenumber.PhonenumberDAOImpl;
import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Phonenumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhonenumberServiceImpl implements PhonenumberService {

    @Autowired
    private PhonenumberDAOImpl dao;

    public int add(Phonenumber phonenumber) {
        return dao.add(phonenumber);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Phonenumber phonenumber) {
        return dao.update(phonenumber);
    }

    public Phonenumber get(int id) {
        return dao.get(id);
    }

    public List<Phonenumber> list() {
        return dao.list();
    }
}
