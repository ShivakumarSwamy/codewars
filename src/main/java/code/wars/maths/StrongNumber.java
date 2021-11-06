package code.wars.maths;

import static java.util.stream.IntStream.rangeClosed;

import java.util.stream.IntStream;

public class StrongNumber {

    public static String isStrongNumber(int num) {
        return isStrongNumber3(num);
    }

    private static String isStrongNumber1(int num) {
        int sum = 0;
        int number = num;

        while (number > 9) {
            sum += factorial(number % 10);
            number = number / 10;
        }

        sum += factorial(number);

        return sum == num ? "STRONG!!!!" : "Not Strong !!";
    }

    private static String isStrongNumber2(int num) {
        return String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .map(operand -> rangeClosed(1, operand).reduce(1, (left, right) -> left * right))
                .sum() == num ? "STRONG!!!!" : "Not Strong !!";
    }

    private static String isStrongNumber3(int num) {
        return IntStream.of(1, 2, 145, 40586)
                .anyMatch(value -> value == num) ? "STRONG!!!!" : "Not Strong !!";

    }

    private static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
