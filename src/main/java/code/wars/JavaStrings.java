package code.wars;

public class JavaStrings {
    public static long sum(String s, String s1) {
        return s.length() + (long) s1.length();
    }

    public static String aGreaterThanB(String a, String b) {
        return a.compareTo(b) > 0 ? "Yes" : "No";
    }

    public static String capitalizeAB(String a, String b) {
        return a.substring(0, 1).toUpperCase() + a.substring(1)
                + " "
                + b.substring(0, 1).toUpperCase() + b.substring(1);
    }
}
