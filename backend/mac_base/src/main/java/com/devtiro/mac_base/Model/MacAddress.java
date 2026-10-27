package com.devtiro.mac_base.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "macaddress")
public class MacAddres {

    @Id
    @Column(name = "macadress", nullable = false, unique = true)
    private long macAddres;

    @ManyToOne
    @JoinColumn(name = "device", referencedColumnName = "serialNumber")
    private Device device;

    private boolean returmed = false;

    public MacAddres() {
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public long getMacAddress() {
        return macAddres;
    }

    public void setMacAddress(long macAddress) {
        this.macAddres = macAddress;
    }

    public boolean isReturmed() {
        return returmed;
    }

    public void setReturmed(boolean returmed) {
        this.returmed = returmed;
    }
}
