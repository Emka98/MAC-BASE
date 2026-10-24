package com.devtiro.mac_base.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    private Integer serialnumber;
    private String name;
    private int amountMacaddress;
    private long firstMacaddress;
    private Range idOwner;

    public Device() {
    }

    public Device(Integer serialnumber, String name, int amountMacaddress, long firstMacaddress) {
        this.serialnumber = serialnumber;
        this.name = name;
        this.amountMacaddress = amountMacaddress;
        this.firstMacaddress = firstMacaddress;
    }

    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountMacaddress() {
        return amountMacaddress;
    }

    public void setAmountMacaddress(int amountMacaddress) {
        this.amountMacaddress = amountMacaddress;
    }

    public long getFirstMacaddress() {
        return firstMacaddress;
    }

    public void setFirstMacaddress(long firstMacaddress) {
        this.firstMacaddress = firstMacaddress;
    }

    public Range getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Range idOwner) {
        this.idOwner = idOwner;
    }

    @Override
    public String toString() {
        return "Device [serialnumber=" + serialnumber + ", name=" + name + ", amountMacaddress=";
    }
}
