package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SumOfOddNumbersTest {

    @Test
    void test1() {
        assertThat(SumOfOddNumbers.sum(1))
                .isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(SumOfOddNumbers.sum(42))
                .isEqualTo(74088);
    }
}
