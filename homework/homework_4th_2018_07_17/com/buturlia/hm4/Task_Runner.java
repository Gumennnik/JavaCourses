package com.buturlia.hm4;

import java.util.*;
import java.util.function.Consumer;

public class Task_Runner{

    public static void main(String[] args) {


//        //Task 1
//        //Написать метод для конвертации массива строк/чисел в список.
//        //Желательно использовать реализацию функционального интерфейса, содержащего метод: List <T> convert(T [] objectArray);
//        String[] a = {"abcd" , "efg", "higk" , "lmn"};
//        TaskAboutConvertation taskAboutConvertation = new TaskAboutConvertation();
//
//        Double[] b = {1.0 , 2.0 , 3.0 , 4.0 , 5.0 , 6.0};
//        System.out.println(a.getClass());
//        System.out.println(taskAboutConvertation.convertToList(a).getClass());


//        //Task2
//        //Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
//        //Реализовать метод get(int index), который возвращает любой элемент массива по индексу.
//        TaskUniversalSaver taskUniversalSaver = new TaskUniversalSaver();
//        taskUniversalSaver.addElement(new Integer(5));
//        taskUniversalSaver.addElement(b[5]);
//        taskUniversalSaver.addElement("One more element ");
//        taskUniversalSaver.printAllElementsToTerminal();
//
//        System.out.println(taskUniversalSaver.getElemet(0));

//        //Task 3
//        List<Student> students = new ArrayList<Student>();
//        String[] firstNames = {"Vasya", "Petya", "Kolya", "Natasha", "Abdula", "Ahmed", "Aladin"} ;
//        String[] secondNames = {"Petrov", "Sidorov", "Stalin", "Lenin", "Djugeshvili", "Saakesian"};
//        Random random = new Random();
//        for (int i = 0; i < 10 ; i++) {
//            students.add(new Student( firstNames[random.nextInt(firstNames.length -1 )],secondNames[random.nextInt(secondNames.length -1)], random.nextInt(5), random.nextDouble()*10));
//        }
//        students.stream().forEach((Student s) -> {
//            System.out.println(s.getName() + " " + s.getCourse() + " " + (String.format("%.2f",s.getEveragaGrade())));
//        });
//        Student.printStudents(students,students.get(0).getCourse());

//        //Task 4
//
//        int[] firstSetNumbers = {1,2,3,5,7,8};
//        int[] secondSetNumbers = {1,6,9,14,3,7};
//
//        HashSet set1 = new LinkedHashSet();
//        HashSet set2 = new LinkedHashSet();
//        //adding elements to out set
//        for (int i = 0; i < firstSetNumbers.length; i++) {
//            set1.add(firstSetNumbers[i]);
//        }
//
//        for (int i = 0; i < secondSetNumbers.length; i++) {
//            set2.add(secondSetNumbers[i]);
//        }
//
//        //showing, what we have in our set
//        System.out.println( " set1 is ");
//        set1.iterator().forEachRemaining((s) -> {
//            System.out.print(s + " ");
//        }
//        );
//        System.out.println(" ");
//        System.out.println(" set2 is ");
//        set2.iterator().forEachRemaining((s) ->{
//            System.out.print(s + " ");
//        });
//
//        ArrayList union = TaskAboutCollections.union(set1,set2);
//        System.out.println(" ");
//        union.iterator().forEachRemaining((s) -> System.out.print(s + " "));
//
//        Set intersect = TaskAboutCollections.intersect(set1,set2);
//        System.out.println(" ");
//        intersect.iterator().forEachRemaining((s) -> System.out.print(s + " "));



    }

}
