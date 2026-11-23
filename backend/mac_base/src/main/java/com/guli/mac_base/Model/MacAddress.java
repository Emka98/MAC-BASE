package com.guli.mac_base.Model;

import jakarta.persistence.*;

@Entity
public class MacAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean returned;
    private Long macAddress;

    public MacAddress() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public Long getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(Long macAddress) {
        this.macAddress = macAddress;
    }
}
