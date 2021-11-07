package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TidyNumberTest {

    @Test
    void test1() {
        assertThat(TidyNumber.solve(12)).isTrue();
    }

    @Test
    void test2() {
        assertThat(TidyNumber.solve(32)).isFalse();
    }
}
