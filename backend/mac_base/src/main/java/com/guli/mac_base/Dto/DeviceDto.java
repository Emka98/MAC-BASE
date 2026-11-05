package com.guli.mac_base.Dto;

import com.guli.mac_base.Model.MacAdress;
import com.guli.mac_base.Model.TypeDevice;

import java.util.Set;

public class DeviceDto {

    private int serialNumber;
    private TypeDevice typeDevice;
    private Set<MacAdress> macAdresses;

    public DeviceDto() {
    }

    public TypeDevice getTypeDevice() {
        return typeDevice;
    }

    public void setTypeDevice(TypeDevice typeDevice) {
        this.typeDevice = typeDevice;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Set<MacAdress> getMacAdresses() {
        return macAdresses;
    }

    public void setMacAdresses(Set<MacAdress> macAdresses) {
        this.macAdresses = macAdresses;
    }
}
