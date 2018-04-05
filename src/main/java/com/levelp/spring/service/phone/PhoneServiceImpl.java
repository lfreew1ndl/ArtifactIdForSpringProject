package com.levelp.spring.service.phone;

import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.dao.phone.PhoneDAOImpl;
import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDAOImpl dao;

    public int add(Phone phone) {
        return dao.add(phone);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Phone phone) {
        return dao.update(phone);
    }

    public Phone get(int id) {
        return dao.get(id);
    }

    public List<Phone> list() {
        return dao.list();
    }
}
