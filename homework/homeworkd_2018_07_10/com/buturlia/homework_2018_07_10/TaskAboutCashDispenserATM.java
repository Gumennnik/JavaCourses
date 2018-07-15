package com.buturlia.homework_2018_07_10;

public class TaskAboutCashDispenserATM {
    private int twentyDollarNoteCount;
    private int fiftyDollarNoteCount;
    private int hundreedDollarNoteCount;

    public TaskAboutCashDispenserATM(int twentyDollarNoteCount, int fiftyDollarNoteCount, int hundreedDollarNoteCount) {
        this.twentyDollarNoteCount = twentyDollarNoteCount;
        this.fiftyDollarNoteCount = fiftyDollarNoteCount;
        this.hundreedDollarNoteCount = hundreedDollarNoteCount;
    }

    public int moneyLeft()
    {
        return twentyDollarNoteCount * 20 + fiftyDollarNoteCount * 50 + hundreedDollarNoteCount * 100;
    }

    public void sffMoneyToATM(int twentyDollarNoteCount, int fiftyDollarNoteCount, int hundreedDollarNoteCount) {
        this.twentyDollarNoteCount += twentyDollarNoteCount;
        this.fiftyDollarNoteCount += fiftyDollarNoteCount;
        this.hundreedDollarNoteCount += hundreedDollarNoteCount;
    }

    public boolean withdrawMoneyFromATM(int moneyForWithDraw)
    {
        int hundredNoteReserved = 0;
        int fiftyDollarNoteReserved = 0;
        int twentyDollarNoteReserved = 0;
        int moneyNeded = moneyForWithDraw;

        //Chec conditions
        if ( moneyForWithDraw > moneyLeft())
        {
            System.out.println("Not enough money");
            return false;
        }else if ( moneyForWithDraw%10 != 0 )
        {
            System.out.println("Invalid sum");
            return false;
        }


        if ( moneyForWithDraw/100 > 0 && hundreedDollarNoteCount > 0 )
        {
            if ( hundreedDollarNoteCount >= moneyForWithDraw/100 )
            {
                hundredNoteReserved = moneyForWithDraw/100;

            } else {
                hundredNoteReserved = hundreedDollarNoteCount;
            }

            moneyForWithDraw = moneyForWithDraw - hundredNoteReserved*100;
        }

        if ( moneyForWithDraw/50 > 0 && fiftyDollarNoteCount > 0)
        {
            if ( fiftyDollarNoteCount >= moneyForWithDraw/50 )
            {
                fiftyDollarNoteReserved = moneyForWithDraw/50;

            } else {
                fiftyDollarNoteReserved = fiftyDollarNoteCount;
            }

                moneyForWithDraw = moneyForWithDraw - fiftyDollarNoteReserved * 50;

        }


        if ( moneyForWithDraw/20 > 0 && twentyDollarNoteCount > 0)
        {
            if ( twentyDollarNoteCount >= moneyForWithDraw/20 )
            {
                twentyDollarNoteReserved = moneyForWithDraw/20;

            } else {
                twentyDollarNoteReserved = twentyDollarNoteCount;
            }

            moneyForWithDraw = moneyForWithDraw - fiftyDollarNoteReserved * 20;

        }



//        System.out.println("Money for withdraw is " + moneyForWithDraw + " and money neded is "+moneyNeded);
        if (moneyForWithDraw != 0 )
        {

            if ( twentyDollarNoteCount >= 1 ) {

                hundredNoteReserved = 0;
                fiftyDollarNoteReserved = 0;
                twentyDollarNoteReserved = 0;
                twentyDollarNoteCount--;

                moneyForWithDraw = moneyNeded - 20;
//                System.out.println(moneyForWithDraw);

                if (withdrawMoneyFromATM(moneyForWithDraw) && moneyForWithDraw >= 0) {
                    System.out.println("You have  " + 1 + "x20");
                    twentyDollarNoteReserved = 1;
                    return true;

                } else {
                    twentyDollarNoteCount++;
                    return false;
                }
            }

            System.out.println("Error! ");
            return false;
        }

        hundreedDollarNoteCount = hundreedDollarNoteCount - hundredNoteReserved;
        fiftyDollarNoteCount = fiftyDollarNoteCount - fiftyDollarNoteReserved;
        twentyDollarNoteCount = twentyDollarNoteCount - twentyDollarNoteReserved;


        System.out.println("You have " + hundredNoteReserved + "x100$ ");
        System.out.println("You have " + fiftyDollarNoteReserved + "x50$ ");
        System.out.println("You have " + twentyDollarNoteReserved + "x20$" );
        return true;
    }


    public int getTwentyDollarNoteCount() {
        return twentyDollarNoteCount;
    }

    public int getFiftyDollarNoteCount() {
        return fiftyDollarNoteCount;
    }

    public int getHundreedDollarNoteCount() {
        return hundreedDollarNoteCount;
    }
}
