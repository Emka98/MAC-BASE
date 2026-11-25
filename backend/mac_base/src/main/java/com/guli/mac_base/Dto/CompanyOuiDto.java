package com.guli.mac_base.Dto;

import com.guli.mac_base.Model.Company;
import com.guli.mac_base.Model.CompanyOui;
import jakarta.persistence.Column;

public class CompanyOuiDto {

    private String oui;
    private Integer companyId;

    public CompanyOuiDto() {
    }

    public CompanyOuiDto(CompanyOui companyOui) {
        this.oui = companyOui.getOui();
        this.companyId = companyOui.getCompanyId();
    }

    public String getOui() {
        return oui;
    }

    public void setOui(String oui) {
        this.oui = oui;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
