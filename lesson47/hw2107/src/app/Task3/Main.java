package app.Task3;

import app.Task3.model.Account;
import app.Task3.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", "Smith", 30);
        Person anna = new Person("Anna", "Smith", 25);
        Person mike = new Person("Mike", "Taylor", 33);

        List<Account> accounts = List.of(
                new Account("DE01", john, 1000),
                new Account("DE02", john, 2500),
                new Account("DE03", anna, 3000),
                new Account("DE04", anna, 1500),
                new Account("DE05", mike, 2000)
        );

        Map<Person, Long> result = accounts.stream()
                .collect(Collectors.groupingBy(
                        Account::getOwner,
                        Collectors.summingLong(a -> (long) a.getBalance())
                ));

        System.out.println("Дан список Account (String iban, Person owner, double balance). У одного владельца может быть несколько счетов. Ваша задача получить Map<Person,Long> где ключ, владелец счета, значение сумма его вкладов.\n");
        result.forEach((p, tb) -> {
            System.out.println(p + " : " + tb);
        });
    }
}
