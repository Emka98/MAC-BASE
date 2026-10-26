package com.devtiro.mac_base.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "macaddress")
public class MacAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private LocalDateTime created;
    private LocalDateTime lastModified = null;
    private boolean returned = false;
    private Long macaddres;
    private Range idOwner;
    @ManyToOne
    @JoinColumn(name = "devices_id")
    private Device device;

    public MacAddress() {
    }

    public MacAddress(Long macaddres, Range idOwner, Device device) {
        this.macaddres = macaddres;
        this.idOwner = idOwner;
        this.device = device;
    }

    public Long getMacaddres() {
        return macaddres;
    }

    public void setMacaddres(Long macaddres) {
        this.macaddres = macaddres;
    }

    public Range getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Range idOwner) {
        this.idOwner = idOwner;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        long macAddres = this.idOwner.getIdOwner() + this.macaddres;
        String currentMac = String.format("%012X", macAddres);
        currentMac = currentMac.replaceAll("(.{2})(?=.)", "$1:");
        return currentMac;
    }
}