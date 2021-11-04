package code.wars.maths;

public class SumOfTriangularNumbers {
    public static int sum(int n) {
        return sum3(n);
    }

    private static int sum1(int n) {
        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        int totalSum = sum;
        for (int i = 1; i <= n; i++) {
            sum += i;
            totalSum += sum;
        }
        return totalSum;
    }

    private static int sum2(int n) {
        // n * (n + 1) / 2 -> consecutive sum inclusive
        // n * (n + 1) -> sum of even numbers
        // n power of 2 -> sum of odd numbers
        if (n <= 0) {
            return 0;
        }

        return n * (n + 1) * (n + 2) / 6;
    }

    private static int sum3(int n) {
        if (n <= 0) {
            return 0;
        }

        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += i * (i + 1) / 2;
        }
        return totalSum;
    }
}
