package code.wars.maths;

import java.math.BigInteger;

public class AutomorphicNumber {
    public static String solve(int number) {
        return solve2(number);
    }

    private static String solve1(int number) {
        return String.valueOf((int) Math.pow(number, 2))
                     .endsWith(String.valueOf(number)) ? "Automorphic" : "Not!!";
    }

    private static String solve2(int number) {
        return BigInteger.valueOf(number)
                .pow(2)
                .toString().endsWith(String.valueOf(number)) ? "Automorphic" : "Not!!";
    }
}
