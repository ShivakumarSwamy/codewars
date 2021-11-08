package code.wars.maths;

public class KeepHydrated {
    public static int solve(double time) {
        return solve2(time);
    }

    private static int solve1(double time) {
        return (int)Math.floor(time * 0.5);
    }

    private static int solve2(double time) {
        return (int)(time * 0.5);
    }
}
