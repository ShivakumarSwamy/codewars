package code.wars.maths;

import java.util.stream.IntStream;

public class DisariumNumber {
    public static String solve(int number) {
        return solve1(number);
    }

    private static String solve1(int number) {
        return IntStream.rangeClosed(1, String.valueOf(number).length())
                        .map(exponent -> (int) Math.pow(Character.getNumericValue(String.valueOf(number).charAt(exponent - 1)),
                                                        exponent)).sum() == number ? "Disarium !!" : "Not !!";
    }

}
