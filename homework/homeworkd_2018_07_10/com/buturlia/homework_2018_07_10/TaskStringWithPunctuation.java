package com.buturlia.homework_2018_07_10;

import java.util.regex.Pattern;

public class TaskStringWithPunctuation {
    private String string;

    public TaskStringWithPunctuation(String string) {
        this.string = string;
    }

    public int getPuncuationCount()
    {
//        int counter = 0;
//        string.
//        for (char character:string.toCharArray()
//             ) {
//            if (Pattern.matches("\\p{Punct}",Character.toString(character)))
//            {
//                counter++;
//            }
//
//        }


//        return counter;

        int start = string.indexOf("\\p{Punct}");
        int counter = 0;
//        System.out.println("String lenght is " + string.length());
        while (start >= 0 && start <= string.length())
        {


            counter++;

//            System.out.println("Counter is " +counter);

            start = string.indexOf("\\p{Punct}",start+1);

//            System.out.println("New start is " + start);
//            if (counter >= 26 )
//            {
//                break;
//            }


        }



        return counter;





    }

    public int getCommaCount()
    {
        int start = string.indexOf(",");
        int counter = 0;
//        System.out.println("String lenght is " + string.length());
        while (start >= 0 && start <= string.length())
        {


           counter++;

//            System.out.println("Counter is " +counter);

            start = string.indexOf(',',start+1);

//            System.out.println("New start is " + start);
//            if (counter >= 26 )
//            {
//                break;
//            }


        }



        return counter;

    }
}
