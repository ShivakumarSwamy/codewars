package code.wars.maths;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TidyNumber {
    public static boolean solve(int number) {
        return solve1(number);
    }

    private static boolean solve1(int number) {
        String strNumber = String.valueOf(number);
        return IntStream.range(0, strNumber.length() - 1)
                        .noneMatch(index -> strNumber.charAt(index + 1) < strNumber.charAt(index));
    }

}
