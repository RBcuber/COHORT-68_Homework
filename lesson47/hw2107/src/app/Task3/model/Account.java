package app.Task3.model;

public class Account {
    private String iban;
    private Person owner;
    private double balance;

    public Account(String iban, Person owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}