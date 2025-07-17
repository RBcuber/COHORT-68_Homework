package app.Task1;

import java.util.Objects;

public class Person {
    private String fName;
    private String lName;
    private int age;
    private String email;

    public Person(String fName, String lName, int age, String email) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
    }

    public String getFName() { return fName; }
    public String getLName() { return lName; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(fName, person.fName) && Objects.equals(lName, person.lName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, age, email);
    }

    @Override
    public String toString() {
        return fName + " " + lName;
    }
}