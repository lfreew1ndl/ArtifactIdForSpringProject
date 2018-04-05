package com.levelp.spring.service.region;

import com.levelp.spring.dao.consumer.ConsumerDAOImpl;
import com.levelp.spring.dao.region.RegionDAOImpl;
import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionDAOImpl dao;

    public int add(Region region) {
        return dao.add(region);
    }

    public int remove(int id) {
        return dao.remove(id);
    }

    public int update(Region region) {
        return dao.update(region);
    }

    public Region get(int id) {
        return dao.get(id);
    }

    public List<Region> list() {
        return dao.list();
    }
}
