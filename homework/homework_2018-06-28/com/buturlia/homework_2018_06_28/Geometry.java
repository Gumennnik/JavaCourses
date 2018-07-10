package com.buturlia.homework_2018_06_28;

public class Geometry {
    public Geometry(int a,int b, int r) {
        this.a = a;
        this.b = b;
        this.r = r;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getR() {
        return r;
    }

    private int a;
    private int b;
    private int r;
    public boolean isCanBeRepaired()
    {

        return Math.sqrt(a*a+b*b) < r;
    }

}
