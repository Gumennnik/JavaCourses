package com.buturlia.hm6;

public class Devices {

    private String name;
    private boolean isNeededToRunComputer;

    public Devices() {
        this.name = "Default name";
        this.isNeededToRunComputer = false;
    }

    public Devices(String name, boolean isNeededToRunComputer) {
        this.name = name;
        this.isNeededToRunComputer = isNeededToRunComputer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeededToRunComputer() {
        return isNeededToRunComputer;
    }

    public void setNeededToRunComputer(boolean neededToRunComputer) {
        isNeededToRunComputer = neededToRunComputer;
    }




}
