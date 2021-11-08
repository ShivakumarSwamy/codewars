package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MultipleOf3And5Test {

    @Test
    void test1() {
        assertThat(Multiple0f3And5.solve(10))
                .isEqualTo(23);
    }
}
