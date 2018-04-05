package com.levelp.spring.service.mtc;

import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.dao.mtc.MtcDAOImpl;
import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Mtc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MtcServiceImpl implements MtcService {

    @Autowired
    private MtcDAOImpl dao;

    public int add(Mtc mtc) {
        return dao.add(mtc);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Mtc mtc) {
        return dao.update(mtc);
    }

    public Mtc get(int id) {
        return dao.get(id);
    }

    public List<Mtc> list() {
        return dao.list();
    }
}
