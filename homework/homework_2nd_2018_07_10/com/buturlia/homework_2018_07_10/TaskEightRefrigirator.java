package com.buturlia.homework_2018_07_10;

public class TaskEightRefrigirator extends TaskEightElectronics {
    private double volume;
    private int powerOutPut;

    public TaskEightRefrigirator(double volume, int powerOutPut) {
        this.volume = volume;
        this.powerOutPut = powerOutPut;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPowerOutPut() {
        return powerOutPut;
    }

    public void setPowerOutPut(int powerOutPut) {
        this.powerOutPut = powerOutPut;
    }

    @Override
    public void powerOn() {
        this.setPluggedIntoPowerSocket(true);
    }
}
