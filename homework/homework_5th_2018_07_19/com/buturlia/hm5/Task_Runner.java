package com.buturlia.hm5;
import com.buturlia.hm4.Student;
import netscape.security.UserDialogHelper;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task_Runner {
    public static void main(String[] args) {


//        //First task
//        ListAndSetComparingClass firstTask = new ListAndSetComparingClass();
//        firstTask.generateStudents();
//        firstTask.removeStudents();


        //Second task
        //generating Users
        String[] firstNames = {"Vasya", "Petya", "Kolya", "Natasha", "Abdula", "Ahmed", "Aladin"} ;
        Random random = new Random();
        List<User> firstList = new ArrayList<>();
        List<User> secondList = new ArrayList<>();


        for (int i = 0; i < 5000 ; i++) {
            firstList.add(new User(firstNames[random.nextInt(firstNames.length) ],random ));
            secondList.add(new User(firstNames[random.nextInt(firstNames.length) ],random ));
        }

        List<User> thirdList = firstList.stream().filter( ( User user ) -> {
                if( secondList.indexOf(user) != -1 )
                {
                    System.out.println("Found");
                    return true;
                }else{
                    return false;
                }
           }).collect(Collectors.toList() );

        System.out.println(firstList.size());
        System.out.println(secondList.size());

        System.out.println("Done, third list size is " + thirdList.size());

    }
}
