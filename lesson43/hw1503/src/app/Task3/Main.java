package app.Task3;

import app.Utils;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person jack = new Person("Jack");
        Person anna = new Person("Anna");

        List<Account> accounts = List.of(
                new Account("DE123", jack),
                new Account("DE456", jack),
                new Account("FR111", anna),
                new Account("FR222", anna),
                new Account("FR333", anna)
        );

        Map<Person, List<String>> accountMap = Utils.groupAccountsByOwner(accounts);
        Utils.printMap(accountMap);

    }
}
