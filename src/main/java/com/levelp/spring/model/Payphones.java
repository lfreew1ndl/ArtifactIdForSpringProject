package com.levelp.spring.model;

import javax.persistence.*;

@Entity
public class Payphones {
    private int id;
    private Phonenumber phonenumberByPhoneNumberId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payphones payphones = (Payphones) o;

        if (id != payphones.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "PhoneNumber_id", referencedColumnName = "id", nullable = false)
    public Phonenumber getPhonenumberByPhoneNumberId() {
        return phonenumberByPhoneNumberId;
    }

    public void setPhonenumberByPhoneNumberId(Phonenumber phonenumberByPhoneNumberId) {
        this.phonenumberByPhoneNumberId = phonenumberByPhoneNumberId;
    }
}
