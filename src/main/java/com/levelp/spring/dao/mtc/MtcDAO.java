package com.levelp.spring.dao.mtc;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Mtc;

import java.util.List;


public interface MtcDAO {
    int add(Mtc mtc);

    int remove(int id);

    int update(Mtc mtc);

    Mtc get(int id);

    List<Mtc> list();
}
