package code.wars;

public class ConvertNumberToString {
    public static String numberToString(int num) {
        return numberToString3(num);
    }

    private static String numberToString1(int num) {
        return String.valueOf(num);
    }

    private static String numberToString2(int num) {
        return Integer.toString(num);
    }

    private static String numberToString3(int num) {
        return "" + num;
    }
}
