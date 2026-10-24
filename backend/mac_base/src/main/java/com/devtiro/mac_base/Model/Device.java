package com.devtiro.mac_base.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    private Integer serialnumber;
    private String name;
    private int amountMacaddress;
    private long firstMacaddress;
    private Range idOwner;
    private LocalDateTime  created;
    private LocalDateTime lastModified = null;
    private LocalDateTime deleted = null;

    public Device() {
    }

    public Device(Integer serialnumber, String name, int amountMacaddress, long firstMacaddress) {
        this.serialnumber = serialnumber;
        this.name = name;
        this.amountMacaddress = amountMacaddress;
        this.firstMacaddress = firstMacaddress;
        this.created = LocalDateTime.now();
    }

    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountMacaddress() {
        return amountMacaddress;
    }

    public void setAmountMacaddress(int amountMacaddress) {
        this.amountMacaddress = amountMacaddress;
    }

    public long getFirstMacaddress() {
        return firstMacaddress;
    }

    public void setFirstMacaddress(long firstMacaddress) {
        this.firstMacaddress = firstMacaddress;
    }

    public Range getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Range idOwner) {
        this.idOwner = idOwner;
    }

    public LocalDateTime getCreated() {

        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public LocalDateTime getDeleted() {
        return deleted;
    }

    public void setDeleted(LocalDateTime deleted) {
        this.deleted = deleted;
    }

    public List<String> getListAllMacaddress() {
        List<String> listAllmacaddress = new ArrayList<>();

        Range baseMacAddress = this.getIdOwner();
        long amount = this.getAmountMacaddress();

        for (long i = 0; i < amount; i++) {
            long currentMacaddress = baseMacAddress.getIdOwner() + this.firstMacaddress + i;
            String currentMac = String.format("%012X", currentMacaddress);
            currentMac = currentMac.replaceAll("(.{2})(?=.)", "$1:");
            listAllmacaddress.add(currentMac);
        }
        return listAllmacaddress;
    }

    @Override
    public String toString() {
        return "Device [serialnumber=" + serialnumber + ", name=" + name + ", amountMacaddress=";
    }
}
