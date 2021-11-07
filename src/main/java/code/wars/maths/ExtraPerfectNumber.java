package code.wars.maths;

import java.util.stream.IntStream;

public class ExtraPerfectNumber {
    public static int[] solve(int number) {
        return solve1(number);
    }

    private static int[] solve1(int number) {
        return IntStream.rangeClosed(1, number)
                        .filter(value -> value % 2 != 0)
                        .toArray();
    }

}
