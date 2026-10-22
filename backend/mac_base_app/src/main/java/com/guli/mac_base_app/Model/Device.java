package com.guli.mac_base_app.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    private Integer serialNumber;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(nullable = false, columnDefinition = "integer default 1")
    private int amountMacAddress = 1;
    @Column(columnDefinition = "BINARY(6)", nullable = false)
    private byte[] firstMacAddress;

    public Device() {
    }

    public Device(int serialNumber, String name, int amountMacAddress, byte[] firstMacAddress) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.amountMacAddress = amountMacAddress;
        this.firstMacAddress = firstMacAddress;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountMacAddress() {
        return amountMacAddress;
    }

    public void setAmountMacAddress(int amountMacAddress) {
        this.amountMacAddress = amountMacAddress;
    }

    public byte[] getFirstMacAddress() {
        return firstMacAddress;
    }

    public void setFirstMacAddress(byte[] firstMacAddress) {
        this.firstMacAddress = firstMacAddress;
    }

    public List<String> getMacAddresses() {
        List<String> macAddresses = new ArrayList<>();

        // Change to long
        long baseMacNumber = 0;
        for (byte b : this.firstMacAddress) {
            baseMacNumber = (baseMacNumber << 8) + (b & 0xFF);
        }

        // next MacAddress
        for (int i = 0; i < this.amountMacAddress; i++) {
            long currentMacNumber = baseMacNumber + i;
            byte[] macBytes = new byte[6];

            // Change to byte
            for (int j = 5; j >= 0; j--) {
                macBytes[j] = (byte) (currentMacNumber & 0xFF);
                currentMacNumber >>= 8;
            }

            // Foramt to XX:XX:XX:XX:XX:XX
            StringBuilder sb = new StringBuilder();
            for (byte b : macBytes) {
                if (sb.length() > 0) {
                    sb.append(":");
                }
                sb.append(String.format("%02X", b));
            }
            macAddresses.add(sb.toString());
        }
        return macAddresses;
    }
}
