package app;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyList<Person> list = new MyArrayList<>();
        list.add(new Person("Jack",23));
        list.add(new Person("Ann",22));
        list.add(new Person("Mike",28));
        list.add(new Person("Nick",21));

        System.out.println("---- for .... each");
        for (Person person : list){
            System.out.println(person);
        }

        System.out.println("---------- iterator ----------");
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person element = iterator.next();
            System.out.println(element);
        }

    }
}
