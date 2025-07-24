package app.Task1;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))){
            System.out.println("Введите строку в файл, для выхода напишите 'exit'");
            while (true) {
                String res = scanner.nextLine();
                if (res.equals("exit")) {
                    break;
                }
                writer.write(res);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Что-то не так");
        }

        List<String> list = null;
        try (BufferedReader reader = new BufferedReader( new FileReader("data.txt")   )) {
            list = reader.lines().toList();
        }catch (IOException e){
            System.out.println("Errror!");
        }
        list.forEach(System.out::println);
    }
}
