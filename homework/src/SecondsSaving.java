public class SecondsSaving {


    public SecondsSaving(int input) {
        this.setSeconds(input);
        this.setSecondsLeft();
        return;
    }


    private int seconds;

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }


    private int secondsLeft;
    private void setSecondsLeft() {
        this.secondsLeft = this.seconds%60;
    }
    public int getSecondsLeft() {
        return secondsLeft;
    }


    public int getMins(){
        int mins = (seconds - secondsLeft)/60;
        return mins;
    }

    public int getMinsLeft() {
        return minsLeft = this.getMins()%60;
    }

    private int minsLeft ;

    public int getHours(){
        int hours = (seconds - minsLeft)/60;
        return hours;
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    private int hoursLeft = this.getHours()%24;
    public int getDays()
    {
        int days = (this.getHours()-hoursLeft)/24;
        return days;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    private int daysLeft = this.getDays()%7;
    public int getWeeks()
    {
        int weeks = (this.getDays()-daysLeft)/7;
        return weeks;
    }





}
