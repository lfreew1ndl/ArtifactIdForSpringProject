package com.levelp.spring.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "number")
public class Number {
    private int number;

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }

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

}
