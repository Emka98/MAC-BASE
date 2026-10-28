package com.guli.mac_base.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Set;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nameCompany;
    private Set<Long> macBlocks;

    public Company() {
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Set<Long> getMacBlocks() {
        return macBlocks;
    }

    public void setMacBlocks(Set<Long> macBlocks) {
        this.macBlocks = macBlocks;
    }
}
