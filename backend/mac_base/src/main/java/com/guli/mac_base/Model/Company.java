package com.guli.mac_base.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyId;

    @Column(length = 200, nullable = false)
    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
            name = "companies_oui",
            joinColumns = @JoinColumn("company_id")
    )
    private Set<Integer> companies_oui = new HashSet<Integer>();
}
