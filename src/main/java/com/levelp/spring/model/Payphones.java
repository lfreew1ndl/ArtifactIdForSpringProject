package com.levelp.spring.model;

import javax.persistence.*;

@Entity
public class Payphones {
    private int id;
    private int phoneNumberId;
    private Phonenumber phonenumberByPhoneNumberId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PhoneNumber_id", nullable = false)
    public int getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(int phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payphones payphones = (Payphones) o;

        if (id != payphones.id) return false;
        if (phoneNumberId != payphones.phoneNumberId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + phoneNumberId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PhoneNumber_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    public Phonenumber getPhonenumberByPhoneNumberId() {
        return phonenumberByPhoneNumberId;
    }

    public void setPhonenumberByPhoneNumberId(Phonenumber phonenumberByPhoneNumberId) {
        this.phonenumberByPhoneNumberId = phonenumberByPhoneNumberId;
    }
}
