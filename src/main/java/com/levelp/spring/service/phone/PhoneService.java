package com.levelp.spring.service.phone;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Phone;

import java.util.List;


public interface PhoneService {
    int add(Phone phone);

    int remove(int id);

    int update(Phone phone);

    Phone get(int id);

    List<Phone> list();
}
