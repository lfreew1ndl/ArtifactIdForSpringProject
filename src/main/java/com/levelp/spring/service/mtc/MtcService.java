package com.levelp.spring.service.mtc;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Mtc;

import java.util.List;


public interface MtcService {
    int add(Mtc mtc);

    int remove(int id);

    int update(Mtc mtc);

    Mtc get(int id);

    List<Mtc> list();
}
