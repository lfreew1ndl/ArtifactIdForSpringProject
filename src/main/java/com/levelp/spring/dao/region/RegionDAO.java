package com.levelp.spring.dao.region;

import com.levelp.spring.model.Consumer;
import com.levelp.spring.model.Region;

import java.util.List;


public interface RegionDAO {
    int add(Region region);

    int remove(int id);

    int update(Region region);

    Region get(int id);

    List<Region> list();
}
