package com.levelp.spring.dao.phone;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Phone;

import java.util.List;


public interface PhoneDAO {
    int add(Phone phone);

    int remove(int id);

    int update(Phone phone);

    Phone get(int id);

    List<Phone> list();
}
