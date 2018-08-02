package com.buturlia.hm5;
import com.buturlia.hm4.Student;

import java.util.*;
import java.util.function.Function;

public class Task_Runner {
    public static void main(String[] args) {

        String[] firstNames = {"Vasya", "Petya", "Kolya", "Natasha", "Abdula", "Ahmed", "Aladin"} ;
        String[] secondNames = {"Petrov", "Sidorov", "Stalin", "Lenin", "Djugeshvili", "Saakesian"};
        Random random = new Random();

        Function<List, List> generateStudents = list -> {
            try {
                for (int i = 0; i < 10000 ; i++) {
                    list.add(new Student( firstNames[random.nextInt(firstNames.length -1 )],secondNames[random.nextInt(secondNames.length -1)], random.nextInt(5), random.nextDouble()*10));
                }

            } catch (Exception e)
            {
                System.out.println("Error in " + list.getClass());
            }
            System.out.println(list.getClass() + " size is " + list.size());
            return list;
        };

        LinkedList<Student> linkedListStudents = new LinkedList<Student>();
        long linkedListTime =  Calendar.getInstance().get(Calendar.MILLISECOND);
        generateStudents.apply(linkedListStudents);
        System.out.println("Linked list lenght is " + linkedListStudents.size());
        linkedListTime = linkedListTime - Calendar.getInstance().get(Calendar.MILLISECOND);
        System.out.println(linkedListTime);
        System.out.println(linkedListStudents.getFirst().getName());


        ArrayList<Student> arrayListStudents = new ArrayList<Student>();
        long arrayListTime =  Calendar.getInstance().get(Calendar.MILLISECOND);
        System.out.println(arrayListTime);
        try {
            for (int i = 0; i < 10000 ; i++) {
                arrayListStudents.add(new Student( firstNames[random.nextInt(firstNames.length -1 )],secondNames[random.nextInt(secondNames.length -1)], random.nextInt(5), random.nextDouble()*10));
//                System.out.println("Added to arraylist");
            }
        }catch (Exception e)
        {
            System.out.println("Error in ArrayList");
        }
        arrayListTime = arrayListTime - Calendar.getInstance().get(Calendar.MILLISECOND);
        System.out.println(arrayListTime);

        TreeSet<Student> treeSetStudents = new TreeSet<Student>();
        long treeSetTime = Calendar.getInstance().get(Calendar.MILLISECOND);
        try{
            for (int i = 0; i < 10000 ; i++) {
                treeSetStudents.add(new Student( firstNames[random.nextInt(firstNames.length -1 )],secondNames[random.nextInt(secondNames.length -1)], random.nextInt(5), random.nextDouble()*10));
            }
        }catch (Exception e)
        {
            System.out.println("Error in TreeSet");
            e.printStackTrace();
        }
        treeSetTime = treeSetTime - Calendar.getInstance().get(Calendar.MILLISECOND);

        HashSet<Student> hashSetStudents = new HashSet<Student>();
        long hashSetTime = Calendar.getInstance().get(Calendar.MILLISECOND);
        try{
            for (int i = 0; i < 10000; i++) {
                hashSetStudents.add(new Student( firstNames[random.nextInt(firstNames.length -1 )],secondNames[random.nextInt(secondNames.length -1)], random.nextInt(5), random.nextDouble()*10));
            }
        }catch (Exception e){
            System.out.println("Error in HashSet");
        }
        hashSetTime = hashSetTime - Calendar.getInstance().get(Calendar.MILLISECOND);

        System.out.println("LinkedList time (ms) is " + linkedListTime);
        System.out.println("Arraylist time (ms) is " + arrayListTime);
        System.out.println("TreeSet time (ms) is  " + treeSetTime);
        System.out.println("HashSet time (ms) is "+ treeSetTime);

    }
}
