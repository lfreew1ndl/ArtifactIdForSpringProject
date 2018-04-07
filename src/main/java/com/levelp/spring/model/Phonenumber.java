package com.levelp.spring.model;

import javax.persistence.*;

@Entity
public class Phonenumber {
    private int id;
    private String houseNumber;
    private Integer apartment;
    private Byte interspace;
    private Number numberByNumber;
    private Street streetByStreetId;
    private PhoneType phoneType;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "PhoneType")
    @Enumerated(EnumType.STRING)
    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phonenumber that = (Phonenumber) o;

        if (id != that.id) return false;
        if (houseNumber != null ? !houseNumber.equals(that.houseNumber) : that.houseNumber != null) return false;
        if (apartment != null ? !apartment.equals(that.apartment) : that.apartment != null) return false;
        if (interspace != null ? !interspace.equals(that.interspace) : that.interspace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (houseNumber != null ? houseNumber.hashCode() : 0);
        result = 31 * result + (apartment != null ? apartment.hashCode() : 0);
        result = 31 * result + (interspace != null ? interspace.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "number", referencedColumnName = "Number", nullable = false)
    public Number getNumberByNumber() {
        return numberByNumber;
    }

    public void setNumberByNumber(Number numberByNumber) {
        this.numberByNumber = numberByNumber;
    }

    @ManyToOne
    @JoinColumn(name = "Street_id", referencedColumnName = "id", nullable = false)
    public Street getStreetByStreetId() {
        return streetByStreetId;
    }

    public void setStreetByStreetId(Street streetByStreetId) {
        this.streetByStreetId = streetByStreetId;
    }
}
