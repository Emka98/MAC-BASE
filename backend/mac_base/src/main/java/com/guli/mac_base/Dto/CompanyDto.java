package com.guli.mac_base.Dto;

import java.util.HashSet;
import java.util.Set;

public class CompanyDto {

    private String company;
    private Set<Long> macBlocks = new HashSet<Long>();

    public CompanyDto() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Set<Long> getMacBlocks() {
        return macBlocks;
    }

    public void setMacBlocks(Set<Long> macBlocks) {
        this.macBlocks = macBlocks;
    }
}
