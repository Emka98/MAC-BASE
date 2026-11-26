package com.guli.mac_base.Dto;

import com.guli.mac_base.Model.Company;
import java.util.Set;

public class DeviceTypeDto {

    private String name;
    private String description;
    private Set<Company> producers;

    public DeviceTypeDto() {
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

    public Set<Company> getProducers() {
        return producers;
    }

    public void setProducers(Set<Company> producers) {
        this.producers = producers;
    }

    public void addCompanyToList(Company company){
        this.producers.add(company);
    }
}
