package com.guli.mac_base.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnTransformer;

@Entity
public class MacAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer macAddressId;
    @Column(nullable = false, unique = true, columnDefinition = "macaddr")
    @ColumnTransformer(write = "?::macaddr")
    private String macAddress;
    private boolean returned;
    private Integer deviceId;



}
