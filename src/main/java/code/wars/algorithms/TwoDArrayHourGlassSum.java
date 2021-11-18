package code.wars.algorithms;

import java.util.List;
import java.util.stream.IntStream;

public class TwoDArrayHourGlassSum {

    public static int hourGlassSum(List<List<Integer>> arr) {
        return hourGlassSum2(arr);
    }

    private static int hourGlassSum1(List<List<Integer>> arr) {
        int maxSum = -63;

        for (int i = 0; i <= 3; i++) { // row
            for (int j = 0; j <= 3; j++) { // col
                maxSum = Math.max(calculateHourGlassSum(arr, i, j), maxSum);
            }
        }
        return maxSum;
    }

    private static int hourGlassSum2(List<List<Integer>> arr) {

        return IntStream.rangeClosed(0, 3)
                        .map(row -> IntStream.rangeClosed(0, 3).map(col -> calculateHourGlassSum(arr, row, col)).max().orElse(0))
                        .max().orElse(0);

    }

    private static int calculateHourGlassSum(List<List<Integer>> arr, int row, int col) {
        return calculateHourGlassSum1(arr, row, col);
    }

    private static int calculateHourGlassSum1(List<List<Integer>> arr, int row, int col) {
        return arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2) + arr.get(row + 1).get(col + 1) + arr
                .get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);
    }

}
