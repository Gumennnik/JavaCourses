package com.buturlia.hm5;

import java.time.LocalDate;
import java.time.Year;
import java.util.*;

public class User {
    private String name;
    private int age;
    private LocalDate dateOfBirth;

    public User(String name, Random random) {
        this.name = name;
        generateDate(random);
        age = LocalDate.now().compareTo(dateOfBirth);
//        System.out.println("Age is " + age);

    }
    private void generateDate(Random random)
    {

        dateOfBirth = randomDateIn(1960 + random.nextInt(50));

        return;

    }
    private LocalDate randomDateIn(int year) {
        Year y = Year.of(year);
        return y.atDay(1+new Random().nextInt(y.length()));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() || !(o instanceof User)) return false;
        User user = (User) o;
        return (this.getName() == ((User) o).getName()) && this.getDateOfBirth().equals(((User) o).getDateOfBirth());
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, dateOfBirth);
    }

    @Override
    public String toString()
    {
        String resultString = name.toString() + " " + Integer.toString(age) + " " + dateOfBirth.toString();
        return resultString;
    }

}
