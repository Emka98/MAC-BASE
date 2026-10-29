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
    @OneToOne
    private TypeDevice typ;
    @OneToMany
    private Set<MacAdres> macAdressSet;

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

    public Set<MacAdres> getMacAdressSet() {
        return macAdressSet;
    }

    public void setMacAdressSet(Set<MacAdres> macAdressSet) {
        this.macAdressSet = macAdressSet;
    }
}
