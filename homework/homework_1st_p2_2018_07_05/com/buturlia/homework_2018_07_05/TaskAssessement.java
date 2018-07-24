package com.buturlia.homework_2018_07_05;

import java.util.Random;

public class TaskAssessement {
    private int[] ourClass;
    private int classSize;

    public TaskAssessement(int classSize) {
        this.classSize = classSize;
        this.ourClass = new int[classSize];
    }

    public void generateClass()
    {
        Random rand = new Random();
        for (int i = 0; i < classSize; i++) {
            ourClass[i] = 1 +  rand.nextInt(9);
        }
        System.out.println(" Our class is (number : grade )");
        for (int i = 0; i < classSize; i++) {
            System.out.print(" (" + (i+1) + " : "+ourClass[i]+") ");
        }
        System.out.println("");

        return;
    }

    public void printBestResultWithNimber()
    {
        for (int i = 0; i < ourClass.length; i++)
        {
            if (ourClass[i] == findBestResult())
            System.out.print("Number " + ( i + 1 )+ " grade is " + ourClass[i] + " ");

        }
        System.out.println(" ");
        return;
    }

    private int findBestResult()
    {
        int best = 0;
        for (int assets:ourClass
             ) {
            if( assets > best)
            {
                best = assets;
            }

        }
        return best;
    }

    public void printFirstAndLast()
    {
        System.out.println("First grade is " + ourClass[0]);
        System.out.println("Last grade is " + ourClass[ourClass.length - 1]);
        return;
    }

}
