package com.levelp.spring.service.phonenumber;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Phonenumber;

import java.util.List;


public interface PhonenumberService {
    int add(Phonenumber phonenumber);

    int remove(int id);

    int update(Phonenumber phonenumber);

    Phonenumber get(int id);

    List<Phonenumber> list();
}
