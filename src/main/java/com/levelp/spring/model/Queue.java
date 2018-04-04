package com.levelp.spring.model;

import javax.persistence.*;

@Entity
public class Queue {
    private int id;
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private int streetId;
    private String houseNumber;
    private String apartment;
    private byte beneficiary;
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
    @Column(name = "firstName", nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "lastName", nullable = false, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "sex", nullable = false, length = 45)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "Street_id", nullable = false)
    public int getStreetId() {
        return streetId;
    }

    public void setStreetId(int streetId) {
        this.streetId = streetId;
    }

    @Basic
    @Column(name = "houseNumber", nullable = false, length = 45)
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Basic
    @Column(name = "apartment", nullable = true, length = 45)
    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Basic
    @Column(name = "beneficiary", nullable = false)
    public byte getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(byte beneficiary) {
        this.beneficiary = beneficiary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Queue queue = (Queue) o;

        if (id != queue.id) return false;
        if (age != queue.age) return false;
        if (streetId != queue.streetId) return false;
        if (beneficiary != queue.beneficiary) return false;
        if (firstName != null ? !firstName.equals(queue.firstName) : queue.firstName != null) return false;
        if (lastName != null ? !lastName.equals(queue.lastName) : queue.lastName != null) return false;
        if (sex != null ? !sex.equals(queue.sex) : queue.sex != null) return false;
        if (houseNumber != null ? !houseNumber.equals(queue.houseNumber) : queue.houseNumber != null) return false;
        if (apartment != null ? !apartment.equals(queue.apartment) : queue.apartment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + streetId;
        result = 31 * result + (houseNumber != null ? houseNumber.hashCode() : 0);
        result = 31 * result + (apartment != null ? apartment.hashCode() : 0);
        result = 31 * result + (int) beneficiary;
        return result;
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
