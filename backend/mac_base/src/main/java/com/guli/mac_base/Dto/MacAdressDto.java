package com.guli.mac_base.Dto;

import jakarta.persistence.Id;

public class MacAdressDto {

    private long macAddress;

    public MacAdressDto() {
    }

    public long getMacAddress() {

        return macAddress;
    }

    public void setMacAddress(long macAddress) {

        this.macAddress = macAddress;
    }

}
