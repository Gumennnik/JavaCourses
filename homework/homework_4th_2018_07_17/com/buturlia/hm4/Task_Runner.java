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
        Double[] b = {1.0 , 2.0 , 3.0 , 4.0 , 5.0 , 6.0};
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

        //Task 4
        //Задача 4:
        //Напишите методы union(Set set1, Set set2) и intersect(Set set1, Set set2), реализующих операции объединения и пересечения двух множеств. Протестируйте работу этих методах на двух предварительно заполненных множествах. (Вам понадобится написать вспомогательный метод, выводящий все элементы множества в консоль).
        //Под пересечением слудует понимать выделение в коллекцию объектов, содержащихся в каждой из коллекций (т.е. одинаковых элементов, встречающихся в каждой коллекции).
        //Коллекция 1: 1,2,3,5,7,8
        //Коллекция 2: 1,6,9,14,3,7
        //Результат работы union: 1,2,3,5,7,8,1,6,9,14,3,7
        //Результат работы intersect: 1,3,7
        HashSet set1 = new LinkedHashSet(Collections.singleton(new int[]{1,2,3,5,7,8}));
        set1.forEach((s) -> {
            System.out.println(s);
        });

    }

}
