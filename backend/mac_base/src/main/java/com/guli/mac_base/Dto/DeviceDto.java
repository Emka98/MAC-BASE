package com.guli.mac_base.Dto;

import com.guli.mac_base.Model.Device;

public class DeviceDto {

    private Integer deviceId;
    private Integer serialNumber;
    private Integer deviceTypId;

    public DeviceDto() {
    }

    public DeviceDto(Device device) {
        this.serialNumber = device.getSerialNumber();
        this.deviceTypId = device.getDeviceTypId();
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getDeviceTypId() {
        return deviceTypId;
    }

    public void setDeviceTypId(Integer deviceTypId) {
        this.deviceTypId = deviceTypId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }
}
