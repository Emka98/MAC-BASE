package com.devtiro.mac_base.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    private Integer serialNumber;
    private String name;

    @Enumerated
    private RangeMac rangeMac;
    private int amount;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MacAddres> macAddresses = new HashSet<MacAddres>();

    private LocalDateTime  created;
    private LocalDateTime lastModified;
    private LocalDateTime deleted;

    public Device() {
    }

    public Integer getSerialnumber() {
        return serialNumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialNumber = serialnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RangeMac getRangeMac() {
        return rangeMac;
    }

    public void setRangeMac(RangeMac rangeMac) {
        this.rangeMac = rangeMac;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Set<MacAddres> getMacAddresses() {
        return macAddresses;
    }

    public void setMacAddresses(Set<MacAddres> macAddresses) {
        this.macAddresses = macAddresses;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public LocalDateTime getDeleted() {
        return deleted;
    }

    public void setDeleted(LocalDateTime deleted) {
        this.deleted = deleted;
    }

    public void addMacAddress(MacAddres macAddres){
        this.macAddresses.add(macAddres);
    }

    @Override
    public String toString() {
        return "Device serialnumber=" +
                serialNumber +
                ", name=" +
                name;
    }
}
