package code.wars.maths;

import java.util.stream.IntStream;

public class Multiple0f3And5 {
    public static int solve(int number) {
        return IntStream.range(3, number)
                .filter(value -> value % 3 == 0 || value % 5 == 0)
                .sum();
    }
}
