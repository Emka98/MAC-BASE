package com.guli.mac_base.Model;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private Integer serialNumber;
    @OneToOne
    private DeviceType typDevice;

    public Device() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public DeviceType getTypDevice() {
        return typDevice;
    }

    public void setTypDevice(DeviceType typDevice) {
        this.typDevice = typDevice;
    }
}
