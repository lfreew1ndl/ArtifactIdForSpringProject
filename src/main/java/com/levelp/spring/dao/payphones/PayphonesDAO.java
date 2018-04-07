package com.levelp.spring.dao.payphones;


import com.levelp.spring.model.Payphones;

import java.util.List;


public interface PayphonesDAO {
    int add(Payphones payphones);

    int remove(int id);

    int update(Payphones payphones);

    Payphones get(int id);

    List<Payphones> list();
}
