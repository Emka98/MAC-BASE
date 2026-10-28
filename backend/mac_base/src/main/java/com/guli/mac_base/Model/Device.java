package com.guli.mac_base.Model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private int serialNumber;
    private TypeDevice typ;
    private Set<MacAdress> macAdressSet;

    public Device() {
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

    public TypeDevice getTyp() {
        return typ;
    }

    public void setTyp(TypeDevice typ) {
        this.typ = typ;
    }

    public Set<MacAdress> getMacAdressSet() {
        return macAdressSet;
    }

    public void setMacAdressSet(Set<MacAdress> macAdressSet) {
        this.macAdressSet = macAdressSet;
    }
}
