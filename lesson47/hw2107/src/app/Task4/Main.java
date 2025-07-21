package app.Task4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
            List<String> payments = List.of(
                    "Jack:1110.00",
                    "Nick:220.50",
                    "Jack:1300.20"
            );

            Map<String, Double> result = payments.stream()
                    .map(s -> s.split(":"))
                    .collect(Collectors.groupingBy(
                            arr -> arr[0],
                            Collectors.summingDouble(arr -> Double.parseDouble(arr[1]))
                    ));
            System.out.println("(По желанию) Дан список выплат в виде списка строк: \"Jack:1110.00\", \"Nick:220.50\", \"Jack:1300.20\".... Необходимо получить Map<String, Double> где ключ это имя, а значение - сумма выплат.");
            System.out.println(result);
        }
}
