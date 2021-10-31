package code.wars.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReverseWords {

    public static String reverseWords(String str) {
        return reverseWords3(str);
    }

    private static String reverseWords1(String str) {
        if (str.length() == 0) {
            return str;
        }

        String[] words = str.split(" ");
        String reversedWords = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords += words[i];

            if (i != 0) {
                reversedWords += " ";
            }
        }
        return reversedWords;
    }

    private static String reverseWords2(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    private static String reverseWords3(String str) {

        return Arrays.stream(str.split(" "))
                .reduce((s, s2) -> s2 + " " + s)
                     .orElse("");
    }
}
