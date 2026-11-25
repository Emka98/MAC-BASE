package com.guli.mac_base.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class DeviceType {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer device_typ_id;
    @Column(length = 64, nullable = false, unique = true)
    private String name;
    private String description;
    private Integer companyId;

    public DeviceType() {
    }

    public Integer getDevice_typ_id() {
        return device_typ_id;
    }

    public void setDevice_typ_id(Integer device_typ_id) {
        this.device_typ_id = device_typ_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
