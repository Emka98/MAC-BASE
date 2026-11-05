package com.guli.mac_base.Dto;

import java.util.HashSet;
import java.util.Set;

public class CompanyDto {

    private String companyName;
    private Set<Long> macBlocks = new HashSet<Long>();

    public CompanyDto() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Set<Long> getMacBlocks() {
        return macBlocks;
    }

    public void setMacBlocks(Set<Long> macBlocks) {
        this.macBlocks = macBlocks;
    }
}
