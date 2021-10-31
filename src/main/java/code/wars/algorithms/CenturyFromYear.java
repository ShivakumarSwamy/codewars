package code.wars.algorithms;

public class CenturyFromYear {

    public static int century(int number) {
        return century2(number);
    }

    private static int century1(int number) {
        if (number <= 100) {
            return 1;
        }

        int remainder = number % 100;
        int quotient = number / 100;
        if (remainder >= 1) {
            return quotient + 1;
        }
        return quotient;
    }

    private static int century2(int number) {
        return (number + 99) / 100;
    }
}
