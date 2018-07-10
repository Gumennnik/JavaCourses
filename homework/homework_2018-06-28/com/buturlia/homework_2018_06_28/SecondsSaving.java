package com.buturlia.homework_2018_06_28;

public class SecondsSaving {



    public SecondsSaving(int input) {
        this.setSeconds(input); // записываем количесвто секунд в наш класс.
        return;
    }


    private int seconds; //наше хранение секунд, с геттером
    private int secondsLeft;
    private int minsLeft ;
    private int hoursLeft;
    private int daysLeft;

    public void calculateAll(){
        this.calculateSecondsLeft();  // высчитываем, сколько секунд осталось "лишних"
        this.calculateMinsLeft(); // считаем, сколько минут осталось "лишних"
        this.calculateHoursLeft(); // считаем, сколько часов осталось
        this.calculateDaysLeft(); // считаем, сколько дней осталось
        return;
    }

    private void setSeconds(int secs) {
        this.seconds = secs;
    }

    public int getSeconds() {

        return this.seconds;
    }

    // Считаем секунды, которые "не поместятся" в минуты". Метод для подсчёта и "геттер" для чтения
    private void calculateSecondsLeft() {
        secondsLeft = this.seconds%60;
    }

    public int getSecondsLeft() {

        return secondsLeft;
    }



    //считаем, сколько всего целых минут
    public int getMins(){
        int mins = seconds / 60;
        return mins;
    }

    //Минуты, которые не помещаются в часы.
    public int calculateMinsLeft() {
        return minsLeft = getMins() % 60;
    }

    public int getMinsLeft() {
        return minsLeft;
    }

    //считаем, сколько всего целых часов
    public int getHours(){
        int hours = getMins()/60;
        return hours;
    }
    // считаем часы, не поместившиеся в дни
    public int calculateHoursLeft() {

        return hoursLeft = getHours()%24;
    }
    public int getHoursLeft() {
        return hoursLeft;
    }

    //считаем сколько всего дней
    public int getDays()
    {
        int days = this.getHours()/24;
        return days;
    }

    public int calculateDaysLeft() {

        return daysLeft = getDays()%7;
    }

    public int getDaysLeft() {
        return daysLeft;
    }


    public int getWeeks()
    {
        int weeks = this.getDays()/7;
        return weeks;
    }





}
