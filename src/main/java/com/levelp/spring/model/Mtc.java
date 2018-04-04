package com.levelp.spring.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Mtc {
    private int id;
    private int atcId;
    private String name;
    private Atc atcByAtcId;
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
    @Column(name = "ATC_id", nullable = false)
    public int getAtcId() {
        return atcId;
    }

    public void setAtcId(int atcId) {
        this.atcId = atcId;
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
        if (atcId != mtc.atcId) return false;
        if (name != null ? !name.equals(mtc.name) : mtc.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + atcId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ATC_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    public Atc getAtcByAtcId() {
        return atcByAtcId;
    }

    public void setAtcByAtcId(Atc atcByAtcId) {
        this.atcByAtcId = atcByAtcId;
    }

    @OneToMany(mappedBy = "mtcByMtcId")
    public Collection<Street> getStreetsById() {
        return streetsById;
    }

    public void setStreetsById(Collection<Street> streetsById) {
        this.streetsById = streetsById;
    }
}
