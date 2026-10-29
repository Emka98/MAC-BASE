package com.guli.mac_base.Model;

import jakarta.persistence.*;

@Entity
public class MacAdres {

    @Id
    private long macAddress;

    public MacAdres() {
    }

    public long getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(long macAddress) {
        this.macAddress = macAddress;
    }

    @Override
    public String toString() {
        return Long.toHexString(macAddress);
    }
}
