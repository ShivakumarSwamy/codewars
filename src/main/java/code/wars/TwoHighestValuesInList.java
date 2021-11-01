package code.wars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoHighestValuesInList {
    public static List<Integer> solve(List<Integer> list) {

        Set<Integer> set = new HashSet<>(list);
        ArrayList<Integer> list2 = new ArrayList<>(set);
        Collections.sort(list2);

        if (list2.size() <= 2) {
            return list2;
        }
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(list2.get(list2.size() - 1));
        integers.add(list2.get(list2.size() - 2));
        return integers;
    }
}
