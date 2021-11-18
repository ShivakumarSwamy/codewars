package code.wars.maths;

public class FlippingBits {
    public static long solve(long n) {
        return solve3(n);
    }

    private static long solve1(long n) {
        String binaryString = Long.toBinaryString(n);
        String binary32String = "0".repeat(32 - binaryString.length()) + binaryString;

        String flipped = binary32String.chars()
                                     .mapToObj(value -> value == '0' ? "1" : "0")
                                     .reduce(String::concat).orElse("");

        return Long.parseUnsignedLong(flipped, 2);
    }

    private static long solve2(long n) {
        return n ^ 4294967295L; // "11111111111111111111111111111111" -> 32 set bits
    }

    private static long solve3(long n) {
        return n ^ Long.parseLong("1".repeat(32), 2);
    }
}
