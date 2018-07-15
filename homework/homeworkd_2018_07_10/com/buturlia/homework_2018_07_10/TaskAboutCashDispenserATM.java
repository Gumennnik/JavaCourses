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


        if ( moneyForWithDraw/100 > 0 )
        {
            if ( hundreedDollarNoteCount >= moneyForWithDraw/100 )
            {
                hundredNoteReserved = moneyForWithDraw/100;

            } else {
                hundredNoteReserved = hundreedDollarNoteCount;
            }

            moneyForWithDraw = moneyForWithDraw - hundredNoteReserved*100;
        }

        if ( moneyForWithDraw/50 > 0 )
        {
            if ( fiftyDollarNoteCount >= moneyForWithDraw/50 )
            {
                fiftyDollarNoteReserved = moneyForWithDraw/50;

            } else {
                fiftyDollarNoteReserved = fiftyDollarNoteCount;
            }
            if( moneyForWithDraw%20 != 0) {
                moneyForWithDraw = moneyForWithDraw - fiftyDollarNoteReserved * 50;
            }
        }

        if (moneyForWithDraw / 20  >= 0)
        {
            if (twentyDollarNoteCount >= moneyForWithDraw/20)
            {
                twentyDollarNoteReserved = moneyForWithDraw/20;
            }else {
                twentyDollarNoteReserved = twentyDollarNoteCount;
            }
            moneyForWithDraw = moneyForWithDraw - twentyDollarNoteReserved*20;
        }

        if (moneyForWithDraw != 0)
        {
            System.out.println("Error! ");
            return false;
        }

        hundreedDollarNoteCount = hundreedDollarNoteCount - hundredNoteReserved;
        fiftyDollarNoteCount = fiftyDollarNoteCount - fiftyDollarNoteReserved;
        twentyDollarNoteCount = twentyDollarNoteCount - twentyDollarNoteReserved;

        System.out.println(" You have " + hundredNoteReserved + " x100$ " + fiftyDollarNoteReserved + " x50$ " + twentyDollarNoteReserved + " x20$" );
        return true;
    }


}
