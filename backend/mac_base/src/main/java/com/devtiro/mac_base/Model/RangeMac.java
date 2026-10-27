package com.devtiro.mac_base.Model;

public enum RangeMac {
    RANGE_CC9F03(224983322198016L,"G-Code");

    private final long idOwner;
    private final String nameOwner;

    RangeMac(long idOwner, String nameOwner) {
        this.idOwner = idOwner;
        this.nameOwner = nameOwner;
    }

    public long getIdOwner() {
        return idOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }
}