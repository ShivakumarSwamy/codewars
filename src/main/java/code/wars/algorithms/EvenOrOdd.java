package code.wars.algorithms;

public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        return evenOrOdd3(number);
    }

    private static String evenOrOdd1(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    private static String evenOrOdd2(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    private static String evenOrOdd3(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}
