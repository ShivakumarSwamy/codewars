package code.wars;

import java.util.stream.LongStream;

public class PaginatingHugeBook {

    public static long solve(long pages) {
        return solve2(pages);
    }

    // times out for large numbers
    private static long solve1(long pages) {
        return LongStream.rangeClosed(2, pages)
                         .map(value -> Long.toString(value).length())
                         .reduce(1, Long::sum);
    }

    private static long solve2(long pages) {
        int length = String.valueOf(pages).length();
        return length * pages - (Long.parseLong("1".repeat(length)) - length);
    }
}
