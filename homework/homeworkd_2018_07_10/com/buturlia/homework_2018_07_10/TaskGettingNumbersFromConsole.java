package com.buturlia.homework_2018_07_10;

import java.util.Calendar;
import java.util.Scanner;

public class TaskGettingNumbersFromConsole {


    private String input;
    private String output = "";
    private int resultSumm = 0;

    public void getInputFromCommandLine()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your line: ");
        input = scanner.nextLine();
        //System.out.println("You entered " + input);
        scanner.close();
        return;
    }


    public void printSeparetedSymbols()
    {

        for (char c : input.toCharArray()
             ) {
            if(Character.isDigit(c)){
                System.out.println("Number is " + c);
                resultSumm = resultSumm + Character.getNumericValue(c);

            } else {
                System.out.println("Character is ");
                output = output + Character.toString(c);

            }

        }
        System.out.println(" ResultSumm = " + resultSumm);
        System.out.println(" Output is = " + output);


        return;
    }

}
