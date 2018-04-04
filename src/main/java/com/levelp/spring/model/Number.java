package com.levelp.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Number {
    private int number;
    private Collection<Phonenumber> phonenumbersByNumber;

    @Id
    @Column(name = "Number", nullable = false)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Number number1 = (Number) o;

        if (number != number1.number) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @OneToMany(mappedBy = "numberByNumber")
    public Collection<Phonenumber> getPhonenumbersByNumber() {
        return phonenumbersByNumber;
    }

    public void setPhonenumbersByNumber(Collection<Phonenumber> phonenumbersByNumber) {
        this.phonenumbersByNumber = phonenumbersByNumber;
    }
}
