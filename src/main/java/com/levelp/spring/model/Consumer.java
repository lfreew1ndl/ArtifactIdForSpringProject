package com.levelp.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "consumer")
public class Consumer {
    private int id;
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private int balance;
    private byte beneficiary;
    private int phoneNumberId;
    private byte connected;
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
    @Column(name = "balance", nullable = false)
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "beneficiary", nullable = false)
    public byte getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(byte beneficiary) {
        this.beneficiary = beneficiary;
    }

    @Basic
    @Column(name = "PhoneNumber_id", nullable = false)
    public int getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(int phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    @Basic
    @Column(name = "connected", nullable = false)
    public byte getConnected() {
        return connected;
    }

    public void setConnected(byte connected) {
        this.connected = connected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Consumer consumer = (Consumer) o;

        if (id != consumer.id) return false;
        if (age != consumer.age) return false;
        if (balance != consumer.balance) return false;
        if (beneficiary != consumer.beneficiary) return false;
        if (phoneNumberId != consumer.phoneNumberId) return false;
        if (connected != consumer.connected) return false;
        if (firstName != null ? !firstName.equals(consumer.firstName) : consumer.firstName != null) return false;
        if (lastName != null ? !lastName.equals(consumer.lastName) : consumer.lastName != null) return false;
        if (sex != null ? !sex.equals(consumer.sex) : consumer.sex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + balance;
        result = 31 * result + (int) beneficiary;
        result = 31 * result + phoneNumberId;
        result = 31 * result + (int) connected;
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
