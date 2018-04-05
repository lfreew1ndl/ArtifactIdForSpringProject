package com.levelp.spring.dao.queue;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Queue;

import java.util.List;


public interface QueueDAO {
    int add(Queue queue);

    int remove(int id);

    int update(Queue queue);

    Queue get(int id);

    List<Queue> list();
}
