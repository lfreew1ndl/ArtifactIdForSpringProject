package com.levelp.spring.service.calls;

import com.levelp.spring.dao.calls.CallsDAOImpl;
import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.model.Calls;
import com.levelp.spring.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallsServiceImpl implements CallsService {

    @Autowired
    private CallsDAOImpl dao;

    public int add(Calls calls) {
        return dao.add(calls);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Calls calls) {
        return dao.update(calls);
    }

    public Calls get(int id) {
        return dao.get(id);
    }

    public List<Calls> list() {
        return dao.list();
    }
}
