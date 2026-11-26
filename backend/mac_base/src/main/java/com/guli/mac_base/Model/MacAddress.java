package com.guli.mac_base.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnTransformer;

@Entity
public class MacAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer macAddressId;
    @Column(nullable = false, unique = true, columnDefinition = "macaddr")
    @ColumnTransformer(write = "?::macaddr")
    private String macAddress;
    private boolean returned;
    @ManyToOne()
    @JoinColumn(name = "device")
    private Device device;

    public MacAddress() {
    }

    public Integer getMacAddressId() {
        return macAddressId;
    }

    public void setMacAddressId(Integer macAddressId) {
        this.macAddressId = macAddressId;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
