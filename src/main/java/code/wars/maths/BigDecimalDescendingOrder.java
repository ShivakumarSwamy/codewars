package code.wars.maths;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BigDecimalDescendingOrder {
    public static List<String> solve(List<String> strings) {
        strings.sort(Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));
        return strings;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = Integer.parseInt(scanner.nextLine());

            List<String> decimals = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                decimals.add(scanner.nextLine());
            }

            solve(decimals).forEach(System.out::println);
        }
    }
}
