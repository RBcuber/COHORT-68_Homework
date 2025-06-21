package app;


public class Pet {
    String type;
    String name;
    String color;
    int age;


    public Pet(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString() {
        return "Животное: " + type +
                ", Имя: " + name +
                ", Цвет: " + color +
                ", Возраст: " + age + " лет";
    }

}
