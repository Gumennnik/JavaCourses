package com.buturlia.homework_2018_07_05;

public class Task_Runner {
    public static void main(String[] args) {


        //Task one: factorial without recursy
        System.out.println("Task One");
        TaskFactorial taskFactorial = new TaskFactorial(14);
        System.out.println("Factorial of "+taskFactorial.getFactorial()+ " is " +taskFactorial.calculateFactorial());

        //Task two
        System.out.println("Task two");
        TaskPrimeNumber taskPrimeNumber = new TaskPrimeNumber(127);
        System.out.println(" ");
        System.out.print("Is number " + taskPrimeNumber.getTargetNumber() + " prime? "+taskPrimeNumber.chekIfNumberIsPrime());
        if( !taskPrimeNumber.chekIfNumberIsPrime() )
        {
            System.out.print(" It is dividable by " + taskPrimeNumber.getDivideNumber());
        }
        System.out.println(" ");

        //Task three
        System.out.println("Task Three");
        TaskFindSumm findSummOfThree = new TaskFindSumm(3,3);
        System.out.println("Task three answer is "+findSummOfThree.findOfThreeDividibleByThree());

        //Task Four
        System.out.println("Task four");
        TaskAssessement taskAssessement = new TaskAssessement(10);
        taskAssessement.generateClass();
        taskAssessement.printBestResultWithNimber();
        taskAssessement.printFirstAndLast();


        //Task Five
        System.out.println("Task Five");
        TaskWIthArray taskWIthArray = new TaskWIthArray(10);
        taskWIthArray.generateArray();
        taskWIthArray.printReversedArray();

        //task Six
        System.out.println("Task Six");
        TaskArraySumm taskArraySumm = new TaskArraySumm(10);
        taskArraySumm.generateArray();
        taskArraySumm.printBetweenMinAndMax();

        System.out.println(" ");

        //task Seven
        System.out.println("Task Seven");
        TaskWithButterflyArray taskWithButterflyArray = new TaskWithButterflyArray(11);
        taskWithButterflyArray.generateArray();




    }
}
