package app.Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jack", "Black", "jack.black@gmail.com", "+49 123456",
                        new Address("10115", "Berlin", "Main Str.", "5")),
                new Person("Anna", "White", "anna.white@gmail.com", "+49 654321",
                        new Address("20095", "Hamburg", "Elm Str.", "12")),
                new Person("John", "Doe", "john.doe@gmail.com", "+49 112233",
                        new Address("80331", "Munich", "Parkstr.", "8A")),
                new Person("Maria", "Green", "maria.green@gmail.com", "+49 445566",
                        new Address("50667", "Cologne", "Marketplatz", "1")),
                new Person("Peter", "Brown", "peter.brown@gmail.com", "+49 778899",
                        new Address("04109", "Leipzig", "Hauptstr.", "33")),
                new Person("Olga", "Smith", "olga.smith@gmail.com", "+49 998877",
                        new Address("70173", "Stuttgart", "Ringstr.", "10"))
        );
        Utils.printPerson(people);
        System.out.println();

        List<String> names = Utils.convertPersonList(people, p -> p.getfName() + " " + p.getlName());
        Utils.printString(names);
        System.out.println();

        List<String> emails = Utils.convertPersonList(people, p -> p.getEmail());
        Utils.printString(emails);
        System.out.println();

        List<String> phones = Utils.convertPersonList(people, p -> p.getPhone());
        Utils.printString(phones);
        System.out.println();

        List<String> addresses = Utils.convertPersonList(people, p -> p.getAddress().toString());
        Utils.printString(addresses);
        System.out.println();

        List<Person> s = people.stream().filter(p -> p.getlName().length()>5).toList();
    }
}
