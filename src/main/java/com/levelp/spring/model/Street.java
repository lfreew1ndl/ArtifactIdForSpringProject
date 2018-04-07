package com.levelp.spring.model;

import javax.persistence.*;

@Entity
public class Street {
    private int id;
    private String name;
    private int index;
    private int channels;
    private Region regionByRegionId;
    private Mtc mtcByMtcId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "index", nullable = false)
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Basic
    @Column(name = "channels", nullable = false)
    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Street street = (Street) o;

        if (id != street.id) return false;
        if (index != street.index) return false;
        if (channels != street.channels) return false;
        if (name != null ? !name.equals(street.name) : street.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + index;
        result = 31 * result + channels;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Region_id", referencedColumnName = "id", nullable = false)
    public Region getRegionByRegionId() {
        return regionByRegionId;
    }

    public void setRegionByRegionId(Region regionByRegionId) {
        this.regionByRegionId = regionByRegionId;
    }

    @ManyToOne
    @JoinColumn(name = "MTC_id", referencedColumnName = "id", nullable = false)
    public Mtc getMtcByMtcId() {
        return mtcByMtcId;
    }

    public void setMtcByMtcId(Mtc mtcByMtcId) {
        this.mtcByMtcId = mtcByMtcId;
    }
}
