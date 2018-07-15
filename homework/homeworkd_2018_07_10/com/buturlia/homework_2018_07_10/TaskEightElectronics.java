package com.buturlia.homework_2018_07_10;

public abstract class TaskEightElectronics {
    private boolean isPluggedIntoPowerSocket;
    private boolean isWorkFromBattery;

    public abstract void powerOn();

    public boolean isPluggedIntoPowerSocket() {
        return isPluggedIntoPowerSocket;
    }

    public boolean isWorkFromBattery() {
        return isWorkFromBattery;
    }

    public void setPluggedIntoPowerSocket(boolean pluggedIntoPowerSocket) {
        isPluggedIntoPowerSocket = pluggedIntoPowerSocket;
    }

    public void setWorkFromBattery(boolean workFromBattery) {
        isWorkFromBattery = workFromBattery;
    }
}
