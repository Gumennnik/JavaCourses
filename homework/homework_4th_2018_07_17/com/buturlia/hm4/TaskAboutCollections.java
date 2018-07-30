package com.buturlia.hm4;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskAboutCollections {

    //Task 4
    //Задача 4:
    //Напишите методы union(Set set1, Set set2) и intersect(Set set1, Set set2), реализующих операции объединения и пересечения двух множеств. Протестируйте работу этих методах на двух предварительно заполненных множествах. (Вам понадобится написать вспомогательный метод, выводящий все элементы множества в консоль).
    //Под пересечением слудует понимать выделение в коллекцию объектов, содержащихся в каждой из коллекций (т.е. одинаковых элементов, встречающихся в каждой коллекции).
    //Коллекция 1: 1,2,3,5,7,8
    //Коллекция 2: 1,6,9,14,3,7
    //Результат работы union: 1,2,3,5,7,8,1,6,9,14,3,7
    //Результат работы intersect: 1,3,7

    public static LinkedHashSet union(Set set1, Set set2)
    {
        LinkedHashSet temporary = new LinkedHashSet();
        set1.iterator().forEachRemaining(s -> temporary.add(s));
        set2.iterator().forEachRemaining(s -> temporary.add(s));
        return temporary;
    }
}
