package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class KeepHydratedTest {

    @Test
    void test1() {
        assertThat(KeepHydrated.solve(2)).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(KeepHydrated.solve(0.97)).isZero();
    }


    @Test
    void test3() {
        assertThat(KeepHydrated.solve(14.64)).isEqualTo(7);
    }

    @Test
    void test4() {
        assertThat(KeepHydrated.solve(1600.20)).isEqualTo(800);
    }


    @Test
    void test5() {
        assertThat(KeepHydrated.solve(80)).isEqualTo(40);
    }
}
