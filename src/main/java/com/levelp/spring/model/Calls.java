package com.levelp.spring.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Calls {
    private int id;
    private int whoCallNumber;
    private int toWhomCallNumber;
    private Date data;
    private int cityCodeWhoCall;
    private int cityCodeToWhomCall;
    private City cityByCityCodeWhoCall;
    private City cityByCityCodeToWhomCall;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "whoCallNumber", nullable = false)
    public int getWhoCallNumber() {
        return whoCallNumber;
    }

    public void setWhoCallNumber(int whoCallNumber) {
        this.whoCallNumber = whoCallNumber;
    }

    @Basic
    @Column(name = "toWhomCallNumber", nullable = false)
    public int getToWhomCallNumber() {
        return toWhomCallNumber;
    }

    public void setToWhomCallNumber(int toWhomCallNumber) {
        this.toWhomCallNumber = toWhomCallNumber;
    }

    @Basic
    @Column(name = "data", nullable = false)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "cityCodeWhoCall", nullable = false)
    public int getCityCodeWhoCall() {
        return cityCodeWhoCall;
    }

    public void setCityCodeWhoCall(int cityCodeWhoCall) {
        this.cityCodeWhoCall = cityCodeWhoCall;
    }

    @Basic
    @Column(name = "cityCodeToWhomCall", nullable = false)
    public int getCityCodeToWhomCall() {
        return cityCodeToWhomCall;
    }

    public void setCityCodeToWhomCall(int cityCodeToWhomCall) {
        this.cityCodeToWhomCall = cityCodeToWhomCall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calls calls = (Calls) o;

        if (id != calls.id) return false;
        if (whoCallNumber != calls.whoCallNumber) return false;
        if (toWhomCallNumber != calls.toWhomCallNumber) return false;
        if (cityCodeWhoCall != calls.cityCodeWhoCall) return false;
        if (cityCodeToWhomCall != calls.cityCodeToWhomCall) return false;
        if (data != null ? !data.equals(calls.data) : calls.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + whoCallNumber;
        result = 31 * result + toWhomCallNumber;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + cityCodeWhoCall;
        result = 31 * result + cityCodeToWhomCall;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "cityCodeWhoCall", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    public City getCityByCityCodeWhoCall() {
        return cityByCityCodeWhoCall;
    }

    public void setCityByCityCodeWhoCall(City cityByCityCodeWhoCall) {
        this.cityByCityCodeWhoCall = cityByCityCodeWhoCall;
    }

    @ManyToOne
    @JoinColumn(name = "cityCodeToWhomCall", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    public City getCityByCityCodeToWhomCall() {
        return cityByCityCodeToWhomCall;
    }

    public void setCityByCityCodeToWhomCall(City cityByCityCodeToWhomCall) {
        this.cityByCityCodeToWhomCall = cityByCityCodeToWhomCall;
    }
}
