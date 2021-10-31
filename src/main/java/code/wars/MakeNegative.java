package code.wars;

public class MakeNegative {
    public static int makeNegative(int x) {
        return makeNegative3(x);
    }

    private static int makeNegative1(int x) {
        if (x == 0) {
            return 0;
        } else if (x < 0) {
            return x;
        }
        return x * -1 ;
    }

    private static int makeNegative2(int x) {
        return Math.abs(x) * -1;
    }

    private static int makeNegative3(int x) {
        return -Math.abs(x);
    }
}
