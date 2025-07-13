package app.hwTask3.model;

public abstract class Employee {
    private String name;
    private int age;
    private int id;
    private String position;
    private double salary;


    private static int idCounter = 1;

    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.id = generateId();
        this.position = position;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    private int generateId() {
        return idCounter++;
    }

    @Override
    public String toString() {
        return position + " - " + name + " (" + age + ") " + salary;
    }
}
