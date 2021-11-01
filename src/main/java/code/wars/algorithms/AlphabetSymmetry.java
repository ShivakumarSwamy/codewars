package code.wars.algorithms;

public class AlphabetSymmetry {
    public static int[] solve(String[] arr) {
        return solve1(arr);
    }

    private static int[] solve1(String[] arr) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int[] holder = new int[arr.length];

        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            char[] word = arr[j].toLowerCase().toCharArray();
            for (int i = 0; i < word.length; i++) {
                if (alphabets.indexOf(word[i]) == i) {
                    count++;
                }
            }
            holder[j] = count;
            count = 0;
        }

        return holder;
    }

}
