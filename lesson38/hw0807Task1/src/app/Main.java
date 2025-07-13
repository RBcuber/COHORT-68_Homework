package app;

import app.hwTask3.model.*;

public class Main {
    public static void main(String[] args) {
        Manager<Programmer> progManager = new Manager<>("Анна", 35, "Team Lead", 6000);

        progManager.addToTeam(new FrontEndProgrammer("Вася", 25, "FrontEnd", 4000));
        progManager.addToTeam(new BackEndProgrammer("Петя", 28,"BackEnd", 4200));

        progManager.printTeam();

        Manager<QAEngineer> progQA = new Manager<>("Алина", 22,"Team Lead", 6500);

        progQA.addToTeam(new QAEngineer("Виталий", 19,"QAEngineer Manual", 2800));
        progQA.addToTeam(new QAEngineer("Ярослав", 21,"QAEngineer Automatic", 2200));
        progQA.printTeam();
    }
}