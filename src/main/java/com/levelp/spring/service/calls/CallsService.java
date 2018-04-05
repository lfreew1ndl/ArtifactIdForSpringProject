package com.levelp.spring.service.calls;

import com.levelp.spring.model.Calls;
import com.levelp.spring.model.Consumer;

import java.util.List;


public interface CallsService {
    int add(Calls calls);

    int remove(int id);

    int update(Calls calls);

    Calls get(int id);

    List<Calls> list();
}
