package com.buturlia.hm5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.Random;

public class User {
    private String name;
    private int age;
    private Calendar dateOfBirth;

    public User(String name, Random random) {
        this.name = name;
        generateDate(random);
        age = (int) ((GregorianCalendar.getInstance().getTimeInMillis() - dateOfBirth.getTimeInMillis()))/ (1000 * 3600 * 24 * 365 );
    }
    private void generateDate(Random random)
    {
        dateOfBirth = new GregorianCalendar();
        dateOfBirth.set((1900 + random.nextInt(110)) , random.nextInt(12) , random.nextInt(28) );
        return;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() || !(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(((User) o).getName()) &&
                dateOfBirth == ((User) o).getDateOfBirth();
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, dateOfBirth);
    }
}
