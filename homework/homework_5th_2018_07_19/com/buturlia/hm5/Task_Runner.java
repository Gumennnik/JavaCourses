package com.buturlia.hm5;
import com.buturlia.hm4.Student;

import java.util.*;

public class Task_Runner {
    public static void main(String[] args) {

        String[] firstNames = {"Vasya", "Petya", "Kolya", "Natasha", "Abdula", "Ahmed", "Aladin"} ;
        String[] secondNames = {"Petrov", "Sidorov", "Stalin", "Lenin", "Djugeshvili", "Saakesian"};
        Random random = new Random();

        List<Student> students = new ArrayList<Student>();
        LinkedList<Student> lLStudents = new LinkedList<Student>();
        int linkedListTime =  System.currentTimeMillis();
        for (int i = 0; i < 10 ; i++) {
            lLStudents.add(new Student( firstNames[random.nextInt(firstNames.length -1 )],secondNames[random.nextInt(secondNames.length -1)], random.nextInt(5), random.nextDouble()*10));
        }






    }
}
