package code.wars.maths;

import java.util.stream.IntStream;

public class JumpingNumber {
    public static String solve(int number) {
        return solve2(number);
    }

    private static String solve1(int number) {
        if (number <= 9) {
            return "Jumping!!";
        }
        String strNumber = String.valueOf(number);
        return IntStream.range(0, strNumber.length() - 1)
                        .allMatch(index -> Math.abs(strNumber.charAt(index) - strNumber.charAt(index + 1)) == 1) ? "Jumping!!" : "Not!!";
    }

    private static String solve2(int number) {
        if (number <= 9) {
            return "Jumping!!";
        }
        String strNumber = String.valueOf(number);
        return IntStream.range(0, strNumber.length() - 1)
                        .anyMatch(index -> Math.abs(strNumber.charAt(index) - strNumber.charAt(index + 1)) != 1) ? "Not!!" : "Jumping!!";
    }
}
