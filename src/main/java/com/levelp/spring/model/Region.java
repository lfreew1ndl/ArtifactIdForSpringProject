package com.levelp.spring.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Region {
    private int id;
    private String name;
    private Collection<Street> streetsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Region region = (Region) o;

        if (id != region.id) return false;
        if (name != null ? !name.equals(region.name) : region.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "regionByRegionId")
    public Collection<Street> getStreetsById() {
        return streetsById;
    }

    public void setStreetsById(Collection<Street> streetsById) {
        this.streetsById = streetsById;
    }
}
