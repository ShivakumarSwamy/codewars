package code.wars.algorithms;

public class CreatePhoneNumber {
    public static String solve(int[] numbers) {
        return solve2(numbers);
    }

    private static String solve1(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (int i = 0; i < numbers.length; i++) {
            if (i == 3) {
                stringBuilder.append(")");
                stringBuilder.append(" ");
            } else if (i == 6) {
                stringBuilder.append("-");
            }
            stringBuilder.append(numbers[i]);
        }
        return stringBuilder.toString();
    }

    private static String solve2(int[] numbers) {
        String phoneNumber = "(xxx) xxx-xxxx";
        for (int number : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(number));
        }
        return phoneNumber;
    }
}
