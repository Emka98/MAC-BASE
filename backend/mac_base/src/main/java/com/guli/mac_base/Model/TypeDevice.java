package com.guli.mac_base.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class TypeDevice {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private String name;
    private String desinerName;
    private Company company;

    public TypeDevice() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
