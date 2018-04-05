package com.levelp.spring.service.queue;

import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.dao.queue.QueueDAOImpl;
import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueueServiceImpl implements QueueService {

    @Autowired
    private QueueDAOImpl dao;

    public int add(Queue queue) {
        return dao.add(queue);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Queue queue) {
        return dao.update(queue);
    }

    public Queue get(int id) {
        return dao.get(id);
    }

    public List<Queue> list() {
        return dao.list();
    }
}
