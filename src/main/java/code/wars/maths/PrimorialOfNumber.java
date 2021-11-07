package code.wars.maths;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class PrimorialOfNumber {

    public static String solve(int n) {
        return solve2(n);
    }

    private static String solve1(int n) {
        return String.valueOf(LongStream.iterate(2, number -> number + 1)
                                       .mapToObj(BigInteger::valueOf)
                                       .filter(PrimorialOfNumber::isPrime)
                                       .limit(n)
                                       .reduce(BigInteger.valueOf(1), BigInteger::multiply));
    }

    private static String solve2(int n) {
        return LongStream.iterate(2, number -> number + 1)
                                        .mapToObj(BigInteger::valueOf)
                                        .filter(PrimorialOfNumber::isPrime)
                                        .limit(n)
                                        .reduce(BigInteger.valueOf(1), BigInteger::multiply).toString();
    }


    private static boolean isPrime(BigInteger number) {
        return isPrime1(number);
    }

    private static boolean isPrime1(BigInteger number) {
        for (long i = 2; i < number.longValue(); i++) {
            if (number.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;
    }

}
