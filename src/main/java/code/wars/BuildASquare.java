package code.wars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BuildASquare {
    public static String generateShape(int n) {
        return generateShape3(n);
    }

    private static String generateShape1(int n) {
        return IntStream.rangeClosed(1, n)
                        .mapToObj(value -> "+".repeat(n))
                        .reduce((s, s2) -> s + "\n" + s2)
                        .orElse("");
    }

    private static String generateShape2(int n) {
        return IntStream.rangeClosed(1, n)
                        .mapToObj(value -> "+".repeat(n))
                        .collect(Collectors.joining("\n"));
    }

    private static String generateShape3(int n) {
        return ("+".repeat(n) + "\n").repeat(n).trim();
    }
}
