package com.devtiro.mac_base.Model;

public enum Range {
    RANGE_CC9F03(224983322198016L,"G-Code"),
    RANGE_CC9F04(224983338975232L,"G-Dron");

    private final long idOwner;
    private final String nameOwner;

    Range(long idOwner, String nameOwner) {
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