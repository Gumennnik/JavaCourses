package com.buturlia.homework_2018_07_10;

public class TaskAboutWordsCount {

    private String string;

    public TaskAboutWordsCount(String string) {
        this.string = string;
    }

    public int countWords()
    {
        int count = 0;
        String[] splittedString = string.split("\\W");
//        System.out.println("Debug message *" + splittedString.length );

        for (String a : splittedString
             ) {
            if ( a.length() == 0){
                continue;
            }
//            System.out.println(a);
            count++;
        }



        return count;
    }

}
