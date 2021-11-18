package code.wars.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        return rotLeft2(a, d);
    }

    private static List<Integer> rotLeft1(List<Integer> a, int d) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a.get(d));
        list.addAll(a.subList(0, d));
        return list;
    }

    private static List<Integer> rotLeft2(List<Integer> a, int d) {
        Collections.rotate(a, -d);
        return a;
    }
}

