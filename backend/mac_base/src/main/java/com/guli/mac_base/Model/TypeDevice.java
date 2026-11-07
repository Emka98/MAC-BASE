package com.guli.mac_base.Model;

import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "typedevices")
public class TypeDevice {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String name;
    private String desinerName;
    @OneToMany
    private Set<Company> companys;

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

    public Set<Company> getCompanys() {
        return companys;
    }

    public void setCompanys(Set<Company> companys) {
        this.companys = companys;
    }
}
