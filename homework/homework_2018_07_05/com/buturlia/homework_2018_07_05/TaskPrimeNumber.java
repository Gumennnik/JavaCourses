package com.buturlia.homework_2018_07_05;

public class TaskPrimeNumber {

    private int targetNumber;


    private int divideNumber = 0;

    public int getDivideNumber() {
        return divideNumber;
    }

    public int getTargetNumber() {
        return targetNumber;
    }
    public TaskPrimeNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public boolean chekIfNumberIsPrime ()
    {
        boolean answer = true;

        for (int i = 2; i < (int)Math.sqrt(targetNumber); i++) {
            if (targetNumber%i == 0)
            {
                answer = false;
                divideNumber = i;
                break;
            }

        }

        return answer;
    }

}
