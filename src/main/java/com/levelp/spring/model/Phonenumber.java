package com.levelp.spring.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "PhoneNumber")
public class Phonenumber {
    private int id;
    private int number;
    private String houseNumber;
    private Integer apartment;
    private Byte interspace;
    private int phoneId;
    private int streetId;
    private Number numberByNumber;
    private Phone phoneByPhoneId;
    private Street streetByStreetId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "number", nullable = false)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    @Column(name = "houseNumber", nullable = true, length = 45)
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Basic
    @Column(name = "apartment", nullable = true)
    public Integer getApartment() {
        return apartment;
    }

    public void setApartment(Integer apartment) {
        this.apartment = apartment;
    }

    @Basic
    @Column(name = "interspace", nullable = true)
    public Byte getInterspace() {
        return interspace;
    }

    public void setInterspace(Byte interspace) {
        this.interspace = interspace;
    }

    @Basic
    @Column(name = "Phone_id", nullable = false)
    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    @Basic
    @Column(name = "Street_id", nullable = false)
    public int getStreetId() {
        return streetId;
    }

    public void setStreetId(int streetId) {
        this.streetId = streetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phonenumber that = (Phonenumber) o;

        if (id != that.id) return false;
        if (number != that.number) return false;
        if (phoneId != that.phoneId) return false;
        if (streetId != that.streetId) return false;
        if (houseNumber != null ? !houseNumber.equals(that.houseNumber) : that.houseNumber != null) return false;
        if (apartment != null ? !apartment.equals(that.apartment) : that.apartment != null) return false;
        if (interspace != null ? !interspace.equals(that.interspace) : that.interspace != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Phonenumber{" +
                "id=" + id +
                ", number=" + number +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartment=" + apartment +
                ", interspace=" + interspace +
                ", phoneId=" + phoneId +
                ", streetId=" + streetId +
                ", numberByNumber=" + numberByNumber +
                ", phoneByPhoneId=" + phoneByPhoneId +
                ", streetByStreetId=" + streetByStreetId +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + number;
        result = 31 * result + (houseNumber != null ? houseNumber.hashCode() : 0);
        result = 31 * result + (apartment != null ? apartment.hashCode() : 0);
        result = 31 * result + (interspace != null ? interspace.hashCode() : 0);
        result = 31 * result + phoneId;
        result = 31 * result + streetId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "number", referencedColumnName = "Number", nullable = false, insertable=false, updatable=false)
    public Number getNumberByNumber() {
        return numberByNumber;
    }

    public void setNumberByNumber(Number numberByNumber) {
        this.numberByNumber = numberByNumber;
    }

    @ManyToOne
    @JoinColumn(name = "Phone_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    public Phone getPhoneByPhoneId() {
        return phoneByPhoneId;
    }

    public void setPhoneByPhoneId(Phone phoneByPhoneId) {
        this.phoneByPhoneId = phoneByPhoneId;
    }

    @ManyToOne
    @JoinColumn(name = "Street_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    public Street getStreetByStreetId() {
        return streetByStreetId;
    }

    public void setStreetByStreetId(Street streetByStreetId) {
        this.streetByStreetId = streetByStreetId;
    }
}
