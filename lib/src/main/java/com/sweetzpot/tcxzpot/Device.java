package com.sweetzpot.tcxzpot;

public class Device extends AbstractSource {

    private final int unitID;
    private final int productID;
    private final Version version;

    public Device(String name, int unitID, int productID, Version version) {
        super(name);
        this.unitID = unitID;
        this.productID = productID;
        this.version = version;
    }
}