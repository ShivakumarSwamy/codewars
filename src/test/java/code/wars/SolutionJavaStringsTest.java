package code.wars;

import java.util.Scanner;

public class SolutionJavaStringsTest {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(JavaStrings.sum(a, b));
            System.out.println(JavaStrings.aGreaterThanB(a, b));
            System.out.println(JavaStrings.capitalizeAB(a, b));
        }
    }
}
