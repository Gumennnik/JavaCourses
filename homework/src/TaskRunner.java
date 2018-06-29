public class TaskRunner
{
    public static void main(String[] args) {

        SecondsSaving a = new SecondsSaving(4503);
        System.out.println(a.getSeconds());
        System.out.println(a.getSecondsLeft());



        System.out.println(a.getHours());
        System.out.println(a.getDays());
        System.out.println(a.getWeeks());
        System.out.println(a.getWeeks()+" weeks "+a.getDaysLeft()+" Days "+a.getHoursLeft()+" Hours "+ a.getMinsLeft() + " mins "+ a.getSecondsLeft()+ " seconds ");
    }

}
