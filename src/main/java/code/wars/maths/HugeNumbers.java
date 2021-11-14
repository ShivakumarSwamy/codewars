package code.wars.maths;

import java.math.BigInteger;
import java.util.Scanner;

public class HugeNumbers {

    public static BigInteger sum(String s, String s1) {
        return new BigInteger(s).add(new BigInteger(s1));
    }

    public static BigInteger multiply(String l, String l1) {
        return new BigInteger(l).multiply(new BigInteger(l1));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String value1 = scanner.nextLine();
            String value2 = scanner.nextLine();
            System.out.println(sum(value1, value2));
            System.out.println(multiply(value1, value2));
        }
    }
}
