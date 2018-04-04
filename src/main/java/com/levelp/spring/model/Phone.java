package com.levelp.spring.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Phone {
    private int id;
    private String type;
    private Collection<Phonenumber> phonenumbersById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (id != phone.id) return false;
        if (type != null ? !type.equals(phone.type) : phone.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "phoneByPhoneId")
    public Collection<Phonenumber> getPhonenumbersById() {
        return phonenumbersById;
    }

    public void setPhonenumbersById(Collection<Phonenumber> phonenumbersById) {
        this.phonenumbersById = phonenumbersById;
    }
}
