package com.guli.mac_base.Dto;

import com.guli.mac_base.Model.Device;
import com.guli.mac_base.Model.MacAddress;

public class MacAddressDto {

    private String macAddress;
    private boolean returned;
    private Device device;

    public MacAddressDto() {
    }

    public MacAddressDto(MacAddress macAddress) {
        this.macAddress = macAddress.getMacAddress();
        this.returned = macAddress.isReturned();
        this.device = macAddress.getDevice();
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
