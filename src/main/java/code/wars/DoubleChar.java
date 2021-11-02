package code.wars;

import java.util.stream.IntStream;

public class DoubleChar {

    public static String solve(String s) {
        return solve2(s);
    }

    private static String solve1(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            stringBuilder.append(c);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private static String solve2(String s) {
        return IntStream.range(0, s.length())
                        .mapToObj(s::charAt)
                        .map(Object::toString)
                        .reduce("", (left, right) -> left + right + right);
    }
}
