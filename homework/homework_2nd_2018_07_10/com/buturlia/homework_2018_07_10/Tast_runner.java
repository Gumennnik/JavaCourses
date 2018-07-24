package com.buturlia.homework_2018_07_10;

import java.util.Scanner;

public class Tast_runner {
    public static void main(String[] args) {



//        //TaskOne
//        TaskGettingNumbersFromConsole taskGettingNumbersFromConsole = new TaskGettingNumbersFromConsole();
//        taskGettingNumbersFromConsole.getInputFromCommandLine();
//        taskGettingNumbersFromConsole.printSeparetedSymbols();


//        Task two
//        TO DO



        //Task three
        TaskCircle taskCircle = new TaskCircle();
        System.out.println(taskCircle.getCircumference());
        taskCircle.replaceCenter();
        TaskCircle taskCircle12 = new TaskCircle(6.0);
        System.out.println(TaskCircle.checkIfCirclesTouchingInOneDot(taskCircle,taskCircle12) );

        //TaskFour


        TaskStringWithPunctuation taskStringWithPunctuation = new TaskStringWithPunctuation("A, bwe !@#  fq ,,!! ");
        System.out.println(taskStringWithPunctuation.getCommaCount(","));
        System.out.println(taskStringWithPunctuation.getPuncuationCountByList());
        System.out.println(taskStringWithPunctuation.getPuncuationCountWithRegex());

        //Task Five
//
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//        System.out.println(string);

        TaskAboutWordsCount taskAboutWordsCount = new TaskAboutWordsCount("qwe !!! egfweg fe reber #R W <l;rwg ?GWE >?");
        System.out.println(taskAboutWordsCount.countWords());
//
        //Task Six
        TaskStringAndStringBufferComparation taskStringAndStringBufferComparation = new TaskStringAndStringBufferComparation("begining ");
        System.out.println(" Time (in miliseconds) for string minus time of stringbuffer is " + taskStringAndStringBufferComparation.compareStringAndStringBuffer());

        //Task Seven
        TaskAboutCashDispenserATM taskAboutCashDispenserATM = new TaskAboutCashDispenserATM(10,10,10);
        System.out.println(taskAboutCashDispenserATM.moneyLeft());
        System.out.println(taskAboutCashDispenserATM.withdrawMoneyFromATM(110));
        System.out.println(taskAboutCashDispenserATM.moneyLeft());

        //Task eight



    }
}
