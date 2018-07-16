package com.buturlia.homework_2018_07_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskStringWithPunctuation {
    private StringBuffer string;

    public TaskStringWithPunctuation(String string) {

        this.string = new  StringBuffer(string);
    }

    public int getPuncuationCountWithRegex()
    {
        int counter =0;
        Matcher matcher = Pattern.compile("\\p{Punct}").matcher(string);

        while (matcher.find())
        {
            counter++;
        }
        return counter;
    }




    public int getPuncuationCountByList()
    {
        int counter =0;

        String allPunctuation = "!@#$%^&*(),.?";

        for (char punct:allPunctuation.toCharArray()
             ) {

            counter += getCommaCount(Character.toString(punct));
//            System.out.println("There are " + counter + " " + punct  + " here");
        }
        return counter;
    }


    public int getCommaCount(String punct)
    {
        int counter = 0;
        int start = string.indexOf(punct);

        while (start >= 0 && start <= string.length())
        {


            counter++;
            start = string.indexOf(punct,start + 1);

            break;

        }


        return counter;

    }
}
