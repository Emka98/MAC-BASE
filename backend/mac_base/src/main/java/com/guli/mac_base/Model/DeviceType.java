package com.guli.mac_base.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class DeviceType {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    @Column(length = 64, nullable = false, unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private  Company company;


}
