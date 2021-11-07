package code.wars.maths;

public class SpecialNumber {
    public static String solve(int number) {
        return solve2(number);
    }

    private static String solve1(int number) {
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .anyMatch(value -> value > 5) ? "NOT!!" : "Special!!";
    }

    private static String solve2(int number) {
        return String.valueOf(number).matches("[0-5]+") ? "Special!!" : "NOT!!";
    }
}
