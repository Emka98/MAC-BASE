package com.guli.mac_base.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "companys")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Set<Long> macBlocks = new HashSet<Long>();

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String nameCompany) {
        this.name = nameCompany;
    }

    public Set<Long> getMacBlocks() {
        return macBlocks;
    }

    public void setMacBlocks(Set<Long> macBlocks) {
        this.macBlocks = macBlocks;
    }

    public void addBlockToSet(long macBlock){
        this.macBlocks.add(macBlock);
    }
}
