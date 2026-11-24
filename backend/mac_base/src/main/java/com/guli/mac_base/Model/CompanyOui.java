package com.guli.mac_base.Model;

import jakarta.persistence.*;

@Entity
public class CompanyOui {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyOuiId;
    private Integer companyId;

    public CompanyOui() {
    }

    public Integer getCompanyOuiId() {
        return companyOuiId;
    }

    public void setCompanyOuiId(Integer companyOuiId) {
        this.companyOuiId = companyOuiId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}