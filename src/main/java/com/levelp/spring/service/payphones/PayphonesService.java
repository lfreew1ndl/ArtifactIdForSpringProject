package com.levelp.spring.service.payphones;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Payphones;

import java.util.List;


public interface PayphonesService {
    int add(Payphones payphones);

    int remove(int id);

    int update(Payphones payphones);

    Payphones get(int id);

    List<Payphones> list();
}
