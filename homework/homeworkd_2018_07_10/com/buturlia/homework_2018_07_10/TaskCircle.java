package com.buturlia.homework_2018_07_10;

import java.util.Random;
import java.util.Scanner;

public class TaskCircle {

    private double x;
    private double y;
    private double r;


    public TaskCircle(int x, int y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public TaskCircle(double r) {
        this.r = r;
        this.x = 0;
        this.y = 0;
    }

    public TaskCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input r and press enter : ");
        r = scanner.nextDouble();
        System.out.println("Please, input x and press enter : ");
        x = scanner.nextInt();
        System.out.println("Please, input y and press enter : ");
        y = scanner.nextInt();
        scanner.close();
    }


    public double getCircumference()
    {
        return 2*Math.PI * r ;
    }

    public void replaceCenter()
    {
        Random random = new Random();
        x = random.nextInt(200) - 100 ;
        y = random.nextInt(200) - 100 ;
        return;
    }

    public static double getDistanceBetweenCenters(TaskCircle first, TaskCircle second)
    {
        return Math.sqrt( Math.pow((first.getX() - second.getX()),2) + Math.pow((first.getY() - second.getY()),2) );
    }

    public static boolean checkIfCirclesTouchingInOneDot(TaskCircle first , TaskCircle second){

        if ( TaskCircle.getDistanceBetweenCenters(first,second) == first.getR() + second.getR() ||
                TaskCircle.getDistanceBetweenCenters(first,second) == first.getR() - second.getR()  )
        {
            return true;
        }
        else {
            return false;
        }
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }


}
