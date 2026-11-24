package com.guli.mac_base.Model;
import jakarta.persistence.*;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deviceId;

    @Column(unique = true)
    private Integer serialNumber;
    private Integer deviceTypId;

    public Device() {
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
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

    public void setDeviceTypId(Integer typDeviceId) {
        this.deviceTypId = typDeviceId;
    }
}
