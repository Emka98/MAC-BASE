package com.guli.mac_base.Model;

import jakarta.persistence.*;

@Entity
public class CompanyOui {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyOuiId;
    @Column(columnDefinition = "macaddr")
    private String oui;
    @OneToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public CompanyOui() {
    }

    public Integer getCompanyOuiId() {
        return companyOuiId;
    }

    public void setCompanyOuiId(Integer companyOuiId) {
        this.companyOuiId = companyOuiId;
    }

    public String getOui() {
        return oui;
    }

    public void setOui(String oui) {
        this.oui = oui;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}