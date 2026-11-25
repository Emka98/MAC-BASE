package com.guli.mac_base.Dto;

import com.guli.mac_base.Model.DeviceType;

public class DeviceTypeDto {

    private String name;
    private String desinerName;
    private Integer companyId;

    public DeviceTypeDto() {
    }

    public DeviceTypeDto(DeviceType deviceType) {
        this.name = deviceType.getName();
        this.companyId = companyId;
        this.desinerName = desinerName;
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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
