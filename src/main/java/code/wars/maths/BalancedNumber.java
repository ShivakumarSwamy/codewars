package code.wars.maths;

public class BalancedNumber {
    public static String balancedNum(long number) {
        return balancedNum3(number);
    }

    private static String balancedNum1(long number) {
        if (number <= 99) {
            return "Balanced";
        }
        String stringNumber = String.valueOf(number);
        int length = stringNumber.length();

        int leftSum = 0;
        int rightSum = 0;

        if (length % 2 == 0) {
            leftSum = stringNumber.substring(0, (length - 1) / 2).chars().mapToObj(Character::toString).map(Integer::valueOf)
                                  .reduce(Integer::sum).orElse(0);
        } else {
            leftSum = stringNumber.substring(0, length / 2).chars().mapToObj(Character::toString).map(Integer::valueOf)
                                  .reduce(Integer::sum).orElse(0);
        }

        rightSum = stringNumber.substring((length / 2) + 1).chars().mapToObj(Character::toString).map(Integer::valueOf)
                               .reduce(Integer::sum).orElse(0);

        return leftSum == rightSum ? "Balanced": "Not Balanced" ;
    }

    private static String balancedNum2(long number) {
        if (number <= 99) {
            return "Balanced";
        }
        String stringNumber = String.valueOf(number);
        int length = stringNumber.length();

        int leftSum = 0;
        int rightSum = 0;

        if (length % 2 == 0) {
            leftSum = stringNumber.substring(0, (length - 1) / 2).chars().mapToObj(value -> Character.digit(value, 10))
                                  .reduce(Integer::sum).orElse(0);
        } else {
            leftSum = stringNumber.substring(0, length / 2).chars().mapToObj(value -> Character.digit(value, 10))
                                  .reduce(Integer::sum).orElse(0);
        }

        rightSum = stringNumber.substring((length / 2) + 1).chars().mapToObj(value -> Character.digit(value, 10))
                               .reduce(Integer::sum).orElse(0);

        return leftSum == rightSum ? "Balanced": "Not Balanced" ;
    }


    private static String balancedNum3(long number) {
        if (number <= 99) {
            return "Balanced";
        }
        String stringNumber = String.valueOf(number);

        int leftSum = stringNumber.chars()
                                  .limit((stringNumber.length() - 1) / 2)
                                  .map(value -> Character.digit(value, 10))
                                  .sum();

        int rightSum = stringNumber.chars()
                                   .skip(stringNumber.length() / 2 + 1)
                                   .map(value -> Character.digit(value, 10))
                                   .sum();

        return leftSum == rightSum ? "Balanced": "Not Balanced" ;
    }
}
