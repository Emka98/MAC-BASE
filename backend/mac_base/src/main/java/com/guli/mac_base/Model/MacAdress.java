package com.guli.mac_base.Model;

import jakarta.persistence.*;

@Entity
public class MacAdress {

    @Id
    private long macAddress;

    public MacAdress() {
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
