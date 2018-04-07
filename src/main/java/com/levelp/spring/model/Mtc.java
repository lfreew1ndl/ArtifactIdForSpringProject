package com.levelp.spring.model;

import javax.persistence.*;

@Entity
public class Mtc {
    private int id;
    private String name;
    private ATCType atcType;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    @Column(name = "ATCType")
    @Enumerated(EnumType.STRING)
    public ATCType getAtcType() {
        return atcType;
    }

    public void setAtcType(ATCType atcType) {
        this.atcType = atcType;
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

        Mtc mtc = (Mtc) o;

        if (id != mtc.id) return false;
        if (name != null ? !name.equals(mtc.name) : mtc.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
