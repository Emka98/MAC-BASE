package com.devtiro.mac_base.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    private Integer serialnumber;
    private String name;
    private int amount;
    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL)
    private Set<MacAddress> macAddresses;
    private LocalDateTime  created;
    private LocalDateTime lastModified = null;
    private LocalDateTime deleted = null;

    public Device() {
    }

    public Device(Integer serialnumber, String name, Set<MacAddress> macAddresses, Range idOwner, LocalDateTime created, LocalDateTime lastModified, LocalDateTime deleted) {
        this.serialnumber = serialnumber;
        this.name = name;
        this.macAddresses = macAddresses;
        this.created = created;
        this.lastModified = lastModified;
        this.deleted = deleted;
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

    public Set<MacAddress> getMacAddresses() {
        return macAddresses;
    }

    public void setMacAddresses(Set<MacAddress> macAddresses) {
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

    @Override
    public String toString() {
        return "Device serialnumber=" +
                serialnumber +
                ", name=" +
                name;
    }
}
