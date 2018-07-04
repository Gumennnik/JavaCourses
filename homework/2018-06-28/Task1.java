public class Task1 {

    public static void run(int parametr)
    {
        SecondsSaving ourTime = new SecondsSaving(parametr);
        ourTime.calculateAll();
        System.out.println("1) " + ourTime.getMins() + " mins "+ourTime.getSecondsLeft()+" seconds");
        System.out.println("2) " + ourTime.getHours() + " hours "+ ourTime.getMinsLeft() + " mins "+ ourTime.getSecondsLeft() + " seconds");
        System.out.println("3) " + ourTime.getDays() + " days " + ourTime.getHoursLeft() + " hours " + ourTime.getMinsLeft() + " mins "+ ourTime.getSecondsLeft()+ " seconds ");
        System.out.println("4) " + ourTime.getWeeks()+" weeks " + ourTime.getDaysLeft()+ " days " + ourTime.getHoursLeft() + " hours " + ourTime.getMinsLeft() + " mins "+ ourTime.getSecondsLeft()+ " seconds ");

    }
}
