package com.buturlia.hm4;

import java.util.function.Consumer;

public class Task_Runner {

    public static void main(String[] args) {


        //Task 1
        //Написать метод для конвертации массива строк/чисел в список.
        //Желательно использовать реализацию функционального интерфейса, содержащего метод: List <T> convert(T [] objectArray);
        String[] a = {"abcd" , "efg", "higk" , "lmn"};
        TaskAboutConvertation taskAboutConvertation = new TaskAboutConvertation();

        Double[] b = {1.0 , 2.0 , 3.0 , 4.0 , 5.0 , 6.0};
        System.out.println(a.getClass());
        System.out.println(taskAboutConvertation.convertToList(a).getClass());

    }
}
