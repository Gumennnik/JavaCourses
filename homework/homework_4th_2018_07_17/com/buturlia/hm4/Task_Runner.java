package com.buturlia.hm4;

import java.util.List;
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


        //Task2
        //Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
        //Реализовать метод get(int index), который возвращает любой элемент массива по индексу.
        TaskUniversalSaver taskUniversalSaver = new TaskUniversalSaver();
        taskUniversalSaver.addElement(new Integer(5));
        taskUniversalSaver.addElement(b[5]);
        taskUniversalSaver.addElement("One more element ");
        taskUniversalSaver.printAllElementsToTerminal();

        System.out.println(taskUniversalSaver.getElemet(0));

        //Напишите класс Student, предоставляющий информацию об имени студента методом getName() и о его курсе методом getCourse().
        //Напишите метод printStudents(List students, int course), который получает список студентов и номер курса и печатает в консоль имена тех студентов из списка, которые обучаются на данном курсе. Для обхода списка в этом методе используйте итератор.
        //
        //Протестируйте ваш метод (для этого предварительно придется создать десяток объектов класса Student и поместить их в список).





    }

}
