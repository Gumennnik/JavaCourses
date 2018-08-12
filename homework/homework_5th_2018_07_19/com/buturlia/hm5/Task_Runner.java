package com.buturlia.hm5;

import java.util.*;

public class Task_Runner {
    public static void main(String[] args) {


//        //First task
//        Task_Runner.runFirstTask();
//
//
//        //Second task
//        Task_Runner.runSecondTask();

//        //Third task
//        Task_Runner.runThirdTask();




    }



    public static void runFirstTask()
    {
        ListAndSetComparingClass firstTask = new ListAndSetComparingClass();
        firstTask.generateStudents();
        firstTask.removeStudents();

    }

    public static void runSecondTask()
    {
        //generating Users
        String[] firstNames = {"Vasya", "Petya", "Kolya", "Natasha", "Abdula", "Ahmed", "Aladin"} ;
        Random random = new Random();
        List<User> firstList = new ArrayList<>();
        List<User> secondList = new ArrayList<>();


        for (int i = 0; i < 5000 ; i++) {
            firstList.add(new User(firstNames[random.nextInt(firstNames.length) ],random ));
            secondList.add(new User(firstNames[random.nextInt(firstNames.length) ],random ));
        }
        long stopWatch = System.currentTimeMillis();
        System.out.println(firstList.iterator().next().toString());

        List<User> thirdList = new ArrayList<>();

        firstList.forEach( (User user) -> {
            if(secondList.contains(user))
            {
                thirdList.add(user);
            }
        });

        stopWatch = (System.currentTimeMillis() - stopWatch ) ;
        System.out.println("Spent time is " + stopWatch);

        System.out.println(firstList.size());
        System.out.println(secondList.size());

        System.out.println("Done, third list size is " + thirdList.size());

    }

    public static void runThirdTask()
    {
        //frequincy dictionary

        String inputedText = "Aenean fermentum convallis imperdiet. Nam quis magna commodo, gravida nisi nec, ornare leo. Suspendisse vel orci ac nisl congue posuere. Cras fringilla volutpat libero, in venenatis nunc. Fusce eleifend hendrerit mi, sit amet consequat odio ultrices non. Integer a nisi ac odio iaculis maximus. Ut gravida id quam sit amet dictum. Vestibulum eget arcu metus. Nullam vestibulum ut quam in tempor. Proin porta auctor nibh, at convallis elit elementum quis. Vivamus pharetra et diam vitae laoreet. Nulla viverra scelerisque luctus. Etiam id faucibus dolor, id tristique sapien. Vivamus vel porta purus, et fermentum nisl. Aliquam egestas convallis mi id consectetur.";
        FrequencyDictionary frequencyDictionary = new FrequencyDictionary(inputedText);
        frequencyDictionary.calculateWords();
        frequencyDictionary.calculateFrequensies();
        frequencyDictionary.printFrequencyDictionary();


    }






}
