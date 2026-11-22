package com.guli.mac_base.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CompaniesOui {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer companiesOuiId;
    String companyName;

}
