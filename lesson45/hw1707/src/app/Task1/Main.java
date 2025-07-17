package app.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = List.of(
                new BankAccount(new Person("John", "Lennon", 40, "lennon@gmail.com"), "DE111", 50000),
                new BankAccount(new Person("Paul", "McCartney", 41, "paul@gmail.com"), "DE222", 90000),
                new BankAccount(new Person("George", "Harrison", 39, "george@gmail.com"), "DE333", 110000),
                new BankAccount(new Person("Ringo", "Starr", 38, "ringo@gmail.com"), "DE444", 75),
                new BankAccount(new Person("Mick", "Jagger", 78, "mick@gmail.com"), "DE555", 105000),
                new BankAccount(new Person("Keith", "Richards", 80, "keith@gmail.com"), "DE666", 55),
                new BankAccount(new Person("David", "Bowie", 19, "bowie@gmail.com"), "DE777", 120),
                new BankAccount(new Person("Freddie", "Mercury", 20, "freddie@gmail.com"), "DE888", 101000),
                new BankAccount(new Person("Elvis", "Presley", 42, "elvis@gmail.com"), "DE999", 500),
                new BankAccount(new Person("Amy", "Winehouse", 20, "amy@gmail.com"), "DE000", 20)
        );
        accounts.forEach(acc -> System.out.println(acc));
        System.out.println("\n\n");


        List<BankAccount> smallBalance = accounts.stream()
                .filter(acc -> acc.getBalance() < 100)
                .toList();

        smallBalance.forEach(acc -> System.out.println(acc));
        System.out.println("\n\n");

        List<Person> richOwners = accounts.stream()
                .filter(acc -> acc.getBalance() > 10000)
                .map(acc -> acc.getOwner())
                .toList();

        richOwners.forEach(person -> System.out.println(person));
        System.out.println("\n\n");

        List<BankAccount> youngOwners = accounts.stream()
                .filter(acc -> acc.getOwner().getAge() < 21)
                .toList();

        youngOwners.forEach(acc -> System.out.println(acc));
        System.out.println("\n\n");


        List<String> vipClients = accounts.stream()
                .filter(acc -> acc.getBalance() > 100000)
                .map(acc -> acc.getOwner().getLName() + " " + acc.getOwner().getFName().charAt(0) + ".; IBAN: " + acc.getIBAN() + ";" + acc.getOwner().getEmail())
                .toList();

        vipClients.forEach(line -> System.out.println(line));



    }



}
