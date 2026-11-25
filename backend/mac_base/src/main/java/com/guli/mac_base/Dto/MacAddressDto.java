package com.guli.mac_base.Dto;

import com.guli.mac_base.Model.MacAddress;

public class MacAddressDto {

    private String macAddress;
    private boolean returned;
    private Integer deviceId;

    public MacAddressDto(MacAddress macAddress) {
        this.macAddress = macAddress.getMacAddress();
        this.returned = macAddress.isReturned();
        this.deviceId = macAddress.getDeviceId();
    }

    public MacAddressDto() {
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

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }
}
