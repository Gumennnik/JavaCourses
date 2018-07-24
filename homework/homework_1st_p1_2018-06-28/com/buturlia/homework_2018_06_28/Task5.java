package com.buturlia.homework_2018_06_28;

public class Task5 {
    public static void run()
    {
        String newLine = System.getProperty("line.separator");
        System.out.println("Starting task 5 " + newLine);

        NumberSaving a = new NumberSaving(1245);
        System.out.println("Our number is " + a.getTargenNumber());
        a.reverseIfFourNumbersAndSyso();
        System.out.println(newLine);

        return;

    }
}
