package com.buturlia.homework_2018_07_10;

public class Tast_runner {
    public static void main(String[] args) {



//        //TaskOne
//        TaskGettingNumbersFromConsole taskGettingNumbersFromConsole = new TaskGettingNumbersFromConsole();
//        taskGettingNumbersFromConsole.getInputFromCommandLine();
//        taskGettingNumbersFromConsole.printSeparetedSymbols();


        //Task two
        //TO DO



//        //Task three
//        TaskCircle taskCircle = new TaskCircle();
//        System.out.println(taskCircle.getCircumference());
//        taskCircle.replaceCenter();
//        TaskCircle taskCircle12 = new TaskCircle(6.0);
//        System.out.println(TaskCircle.checkIfCirclesTouchingInOneDot(taskCircle,taskCircle12) );

//        //TaskFour
//        TaskStringWithPunctuation taskStringWithPunctuation = new TaskStringWithPunctuation("I'd like to build the world a site , And furnish it with porn, Draw hentai pics and girls with dicks And tentacles galore");
//        System.out.println(taskStringWithPunctuation.getCommaCount(","));
//        System.out.println(taskStringWithPunctuation.getPuncuationCountByList());
//        System.out.println(taskStringWithPunctuation.getPuncuationCountWithRegex());

//        //Task Five
//        TaskAboutWordsCount taskAboutWordsCount = new TaskAboutWordsCount("I'd like to teach the world to fap (fap with me) In perfect harmony (perfect harmony) I'd like to show you dirty toons For all eternity");
//        System.out.println(taskAboutWordsCount.countWords());

//        //Task Six
//        TaskStringAndStringBufferComparation taskStringAndStringBufferComparation = new TaskStringAndStringBufferComparation("begining ");
//        System.out.println(" Time (in miliseconds) for string minus time of stringbuffer is " + taskStringAndStringBufferComparation.compareStringAndStringBuffer());

        //Task Seven
        TaskAboutCashDispenserATM taskAboutCashDispenserATM = new TaskAboutCashDispenserATM(10,10,10);
        System.out.println(taskAboutCashDispenserATM.moneyLeft());
        System.out.println(taskAboutCashDispenserATM.withdrawMoneyFromATM(230));
        System.out.println(taskAboutCashDispenserATM.moneyLeft());
    }
}
