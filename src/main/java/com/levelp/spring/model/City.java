package com.levelp.spring.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class City {
    private int id;
    private String name;
    private Collection<Calls> callsById;
    private Collection<Calls> callsById_0;

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

        City city = (City) o;

        if (id != city.id) return false;
        if (name != null ? !name.equals(city.name) : city.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "cityByCityCodeWhoCall")
    public Collection<Calls> getCallsById() {
        return callsById;
    }

    public void setCallsById(Collection<Calls> callsById) {
        this.callsById = callsById;
    }

    @OneToMany(mappedBy = "cityByCityCodeToWhomCall")
    public Collection<Calls> getCallsById_0() {
        return callsById_0;
    }

    public void setCallsById_0(Collection<Calls> callsById_0) {
        this.callsById_0 = callsById_0;
    }
}
