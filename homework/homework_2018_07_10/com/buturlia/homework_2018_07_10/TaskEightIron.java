package com.buturlia.homework_2018_07_10;

public class TaskEightIron extends TaskEightElectronics {

    private int mass;
    private int maxTemp;
    private String manufacturer;



    public TaskEightIron(int mass, int maxTemp, String manufacturer) {
        this.mass = mass;
        this.maxTemp = maxTemp;
        this.manufacturer = manufacturer;
    }

    public TaskEightIron() {

    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    @Override
    public void powerOn() {
        this.setPluggedIntoPowerSocket(true);
    }
}
