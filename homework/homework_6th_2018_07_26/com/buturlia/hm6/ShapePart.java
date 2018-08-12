package com.buturlia.hm6;

public class ShapePart extends Devices{

    private String originCountry;
    private int privceUSD;
    private boolean isPerefery;
    private int powerconsumed;
    private boolean activeCooling;
    private boolean hasCOMPort;
    private boolean hasUSBPort;

    public ShapePart(String name, boolean isNeededToRunComputer, String originCountry, int privceUSD, boolean isPerefery, int powerconsumed, boolean activeCooling, boolean hasCOMPort, boolean hasUSBPort) {
        super(name, isNeededToRunComputer);
        this.originCountry = originCountry;
        this.privceUSD = privceUSD;
        this.isPerefery = isPerefery;
        this.powerconsumed = powerconsumed;
        this.activeCooling = activeCooling;
        this.hasCOMPort = hasCOMPort;
        this.hasUSBPort = hasUSBPort;
    }

    public ShapePart() {
        super();
        this.originCountry = "None";
        this.privceUSD = 0;
        this.isPerefery = false;
        this.powerconsumed = 0;
        this.activeCooling = false;
        this.hasCOMPort = false;
        this.hasUSBPort = false;




    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getPrivceUSD() {
        return privceUSD;
    }

    public void setPrivceUSD(int privceUSD) {
        this.privceUSD = privceUSD;
    }

    public boolean isPerefery() {
        return isPerefery;
    }

    public void setPerefery(boolean perefery) {
        isPerefery = perefery;
    }

    public int getPowerconsumed() {
        return powerconsumed;
    }

    public void setPowerconsumed(int powerconsumed) {
        this.powerconsumed = powerconsumed;
    }

    public boolean isActiveCooling() {
        return activeCooling;
    }

    public void setActiveCooling(boolean activeCooling) {
        this.activeCooling = activeCooling;
    }

    public boolean isHasCOMPort() {
        return hasCOMPort;
    }

    public void setHasCOMPort(boolean hasCOMPort) {
        this.hasCOMPort = hasCOMPort;
    }

    public boolean isHasUSBPort() {
        return hasUSBPort;
    }

    public void setHasUSBPort(boolean hasUSBPort) {
        this.hasUSBPort = hasUSBPort;
    }
}
