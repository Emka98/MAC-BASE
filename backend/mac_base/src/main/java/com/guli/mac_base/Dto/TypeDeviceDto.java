package com.guli.mac_base.Dto;

import com.guli.mac_base.Model.Company;

public class TypeDeviceDto {

    private String name;
    private String desinerName;
    private Company company;

    public TypeDeviceDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesinerName() {
        return desinerName;
    }

    public void setDesinerName(String desinerName) {
        this.desinerName = desinerName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
