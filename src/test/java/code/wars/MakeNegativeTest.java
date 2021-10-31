package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MakeNegativeTest {

    @Test
    void test1() {
        assertThat(MakeNegative.makeNegative(1))
                .isEqualTo(-1);
    }

    @Test
    void test2() {
        assertThat(MakeNegative.makeNegative(-2))
                .isEqualTo(-2);
    }

    @Test
    void test3() {
        assertThat(MakeNegative.makeNegative(0))
                .isZero();
    }
}
