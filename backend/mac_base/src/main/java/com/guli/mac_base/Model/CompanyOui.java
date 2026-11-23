package com.guli.mac_base.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnTransformer;

@Entity
public class CompanyOui {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyOuiId;
    @ColumnTransformer(read = "oui::text", write = "?::macaddr")
    private String oui;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Company company;

    public CompanyOui() {
    }

    public Integer getCompaniesOuiId() {
        return companyOuiId;
    }

    public void setCompaniesOuiId(Integer companiesOuiId) {
        this.companyOuiId = companiesOuiId;
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