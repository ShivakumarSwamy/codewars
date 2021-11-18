package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FlippingBitsTest {

    @Test
    void test1() {
        assertThat(FlippingBits.solve(9L))
                .isEqualTo(4294967286L);
    }

    @Test
    void test2() {
        assertThat(FlippingBits.solve(1L))
                .isEqualTo(4294967294L);
    }
}
