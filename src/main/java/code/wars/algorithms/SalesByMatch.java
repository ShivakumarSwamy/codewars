package code.wars.algorithms;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        return socketMerchant4(n, ar);
    }

    private static int socketMerchant1(int n, List<Integer> ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer sock : ar) {
            map.merge(sock, 1, Integer::sum);
        }

        return map.values().stream().mapToInt(value -> value / 2).sum();
    }

    private static int socketMerchant2(int n, List<Integer> ar) {
        Collections.sort(ar);

        int count = 0;

        for (int i = 0; i < ar.size() - 1; i++) {
            if (Objects.equals(ar.get(i), ar.get(i + 1))) {
                count++;
                i++;
            }
        }
        return count;
    }

    private static int socketMerchant3(int n, List<Integer> ar) {
        int[] colors = new int[101];
        int pairCount = 0;
        for (int i = 0; i < n; i++) {
            colors[ar.get(i)]++;

            if (colors[ar.get(i)] == 2) {
                pairCount++;
                colors[ar.get(i)] = 0;
            }
        }
        return pairCount;
    }

    private static int socketMerchant4(int n, List<Integer> ar) {

        return ar.stream()
                .collect(Collectors.toMap(
                        integer -> integer,
                        integer -> 1,
                        Integer::sum
                ))
                .values()
                .stream()
                .mapToInt(value -> value / 2).sum();
    }
}
