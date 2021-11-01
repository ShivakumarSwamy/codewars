package code.wars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlternateCapitalization {

    public static String[] capitalize(String s) {
        return capitalize2(s);
    }

    private static String[] capitalize1(String s) {
        char[] chars = s.toCharArray();
        String evenString = "";
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                evenString += String.valueOf(chars[i]).toUpperCase();
            } else {
                evenString += chars[i];
            }
        }

        String oddString = "";
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 != 0) {
                oddString += String.valueOf(chars[i]).toUpperCase();
            } else {
                oddString += chars[i];
            }
        }

        return new String[] { evenString, oddString };
    }

    private static String[] capitalize2(String s) {

        String evenString = IntStream.range(0, s.length())
                                     .mapToObj(value -> value % 2 == 0 ? Character.toUpperCase(s.charAt(value)) : s.charAt(value))
                                     .map(Object::toString)
                                      .collect(Collectors.joining());

        String oddString = IntStream.range(0, s.length())
                                    .mapToObj(value -> value % 2 != 0 ? Character.toUpperCase(s.charAt(value)) : s.charAt(value))
                                    .map(Object::toString)
                                    .collect(Collectors.joining());

        return new String[] { evenString, oddString };

    }
}
