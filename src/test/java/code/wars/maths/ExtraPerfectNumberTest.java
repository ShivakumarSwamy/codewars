package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ExtraPerfectNumberTest {

    @Test
    void test1() {
        assertThat(ExtraPerfectNumber.solve(3))
                .containsExactly(1, 3);
    }

    @Test
    void test2() {
        assertThat(ExtraPerfectNumber.solve(8))
                .containsExactly(1, 3, 5, 7);
    }
}
