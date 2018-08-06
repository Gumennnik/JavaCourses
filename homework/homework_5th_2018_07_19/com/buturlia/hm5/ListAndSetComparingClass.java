package com.buturlia.hm5;

import com.buturlia.hm4.Student;

import java.util.*;


public class ListAndSetComparingClass {

    private String[] firstNames = {"Vasya", "Petya", "Kolya", "Natasha", "Abdula", "Ahmed", "Aladin"} ;

    private String[] secondNames = {"Petrov", "Sidorov", "Stalin", "Lenin", "Djugeshvili", "Saakesian"};

    private Random random = new Random();

    private LinkedList<Student> studentLinkedList = new LinkedList<>();
    private int linkedListTime;

    private ArrayList<Student> arrayListStudents = new ArrayList<Student>();
    private int arrayListTime;

    private TreeSet<Student> treeSetStudents = new TreeSet<Student>();
    private int treeSetTime;

    private HashSet<Student> hashSetStudents = new HashSet<Student>();
    private int hashSetTime;

    private HashMap<Long, Collection> resultHashMap = new HashMap<>(4);


    public ListAndSetComparingClass() {

    }

    private void createStudents(Collection list)
        {
            Long time = System.currentTimeMillis();
            try {
                for (int i = 0; i < 100000 ; i++) {
                    list.add(new Student( firstNames[random.nextInt(firstNames.length -1 )],secondNames[random.nextInt(secondNames.length -1)], random.nextInt(5), random.nextDouble()*10));
                }
                time = System.currentTimeMillis() - time;

//                System.out.println(list.getClass() + " size is " + list.size());
                System.out.println(list.getClass() + " time is " + time);
                resultHashMap.put(time, list);
//                System.out.println( "HashMap size() is " + resultHashMap.size());
                return;

            } catch (Exception e)
            {
                System.out.println("Error in " + list.getClass());
                time = null;
                return;
            }

        }

    public void generateStudents()
    {
        createStudents(studentLinkedList);
        createStudents(arrayListStudents);
        createStudents(hashSetStudents);
        createStudents(treeSetStudents);

        System.out.println("Result hashMap size is " + resultHashMap.size());
//        resultHashMap.forEach( (Long time, Collection list) -> {
//            System.out.println(" ");
//            System.out.print(" Collection " + list.getClass() + " time is " + time);
//        });
    }

    public void removeStudents()
    {
        long time = System.currentTimeMillis();
        int iter = 1000;
        for (int i = 0; i < iter; i++) {
            studentLinkedList.removeFirst();
        }
        time = System.currentTimeMillis() - time;
        System.out.println("LinkedList time is " + time);

        time = System.currentTimeMillis();
        for (int i = 0; i < iter; i++) {
            arrayListStudents.remove(0);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("ArrayList time is " + time);

        time = System.currentTimeMillis();
        for (int i = 0; i < iter; i++) {
            treeSetStudents.remove(treeSetStudents.first());
        }
        time = System.currentTimeMillis() - time;
        System.out.println("TreeSet time is " + time);

        time = System.currentTimeMillis();
        for (int i = 0; i < iter; i++) {
            hashSetStudents.remove(hashSetStudents.iterator().next());
        }
        time = System.currentTimeMillis() - time;
        System.out.println("HashSet time is " + time);




        return;
    }




}
