package com.guli.mac_base.Model;

import com.guli.mac_base.Dto.DeviceDto;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table("devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private Integer serialNumber;
    @OneToOne
    @JoinColumn(name = "type_device_id")
    private TypeDevice typDevice;
    @OneToMany
    private Set<MacAdress> macAdressSet;

    public Device() {
    }

    public Device(DeviceDto deviceDto) {
        this.serialNumber = deviceDto.getSerialNumber();
        this.macAdressSet = deviceDto.getMacAdresses();
        this.typDevice = deviceDto.getTypeDevice();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public TypeDevice getTypDevice() {
        return typDevice;
    }

    public void setTypDevice(TypeDevice typ) {
        this.typDevice = typ;
    }

    public Set<MacAdress> getMacAdressSet() {
        return macAdressSet;
    }

    public void setMacAdressSet(Set<MacAdress> macAdressSet) {
        this.macAdressSet = macAdressSet;
    }
}
