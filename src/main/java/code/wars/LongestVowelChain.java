package code.wars;

import java.util.Arrays;

public class LongestVowelChain {
    public static int solve(String s) {
        return solve4(s);
    }

    private static int solve1(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int chainCounter = 0;
        int maxChainCounter = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                chainCounter++;
            } else {
                if (chainCounter > maxChainCounter) {
                    maxChainCounter = chainCounter;
                }
                chainCounter = 0;
            }
        }
        return Math.max(chainCounter, maxChainCounter);
    }

    private static int solve2(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int chainCounter = 0;
        int maxChainCounter = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                chainCounter++;
                maxChainCounter = Math.max(chainCounter, maxChainCounter);
            } else {
                chainCounter = 0;
            }
        }
        return maxChainCounter;
    }

    private static int solve3(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int chainCounter = 0;
        int maxChainCounter = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                maxChainCounter = Math.max(++chainCounter, maxChainCounter);
            } else {
                chainCounter = 0;
            }
        }
        return maxChainCounter;
    }

    private static int solve4(String s) {
        if (s.length() == 0) {
            return 0;
        }

        return Arrays.stream(s.split("[^aeiou]"))
                     .mapToInt(String::length)
                     .max()
                     .getAsInt();
    }
}
