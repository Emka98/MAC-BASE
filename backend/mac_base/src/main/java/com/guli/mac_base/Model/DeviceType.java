package com.guli.mac_base.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class DeviceType {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer deviceTypeId;
    @Column(length = 64, nullable = false, unique = true)
    private String name;
    private String description;
    @ManyToMany()
    @JoinTable(
            name = "device_type_producers",
            joinColumns = @JoinColumn(name = "device_type_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id")
    )
    private Set<Company> producers = new HashSet<Company>();

    public DeviceType() {
    }

    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
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

    public void addToProducers(Company company){
        this.producers.add(company);
    }
}
