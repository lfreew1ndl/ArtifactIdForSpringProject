package com.levelp.spring.service.queue;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Queue;

import java.util.List;


public interface QueueService {
    int add(Queue queue);

    int remove(int id);

    int update(Queue queue);

    Queue get(int id);

    List<Queue> list();
}
