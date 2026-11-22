//package com.guli.mac_base.Model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "macadress")
//public class MacAdress {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private boolean returned;
//    private Long macAddress;
//
//    public MacAdress() {
//    }
//
//    public Long getMacAddress() {
//        return macAddress;
//    }
//
//    public void setMacAddress(Long macAddress) {
//        this.macAddress = macAddress;
//    }
//
//    @Override
//    public String toString() {
//        return Long.toHexString(macAddress);
//    }
//}
