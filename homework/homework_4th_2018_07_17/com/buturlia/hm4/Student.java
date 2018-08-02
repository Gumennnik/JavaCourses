package com.buturlia.hm4;

import java.util.List;

public class Student implements Comparable {

    //Напишите класс Student, предоставляющий информацию об имени студента методом getName() и о его курсе методом getCourse().
    //Напишите метод printStudents(List students, int course), который получает список студентов и номер курса и печатает в консоль имена тех студентов из списка, которые обучаются на данном курсе. Для обхода списка в этом методе используйте итератор.

    private String firstName;
    private String secondName;
    private int yearOfEducation;
    private double everagaGrade;

    public Student( String firstName, String secondName, int yearOfEducation, double everagaGrade){
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfEducation = yearOfEducation;
        this.everagaGrade = everagaGrade;

    }


    public double getEveragaGrade() {
        return everagaGrade;
    }

    public String getName() {
        return (firstName + " " +secondName);
    }

    public int getCourse() {
        return yearOfEducation;
    }

    public static void printStudents(List<Student> students,int courseNumber)
    {
//        System.out.println("Stream working");
//        System.out.println(students.stream().filter(student -> student.getCourse() == courseNumber)
//                .map((Student student1) -> printStudentAndGrade(student1)));
        System.out.println( "Foreach working");

        students.forEach( (Student student) -> {
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName() + " " + student.getCourse());
            }
        } );

        return;
    }

    @Override
    public int compareTo(Object o) {
        if( !(o instanceof Student)) return -100;
        return (int) (this.getEveragaGrade() - ((Student) o).getEveragaGrade());
    }
}
