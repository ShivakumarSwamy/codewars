package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class JumpingNumberTest {

    @Test
    void jumpNumberTest() {
        assertThat(JumpingNumber.solve(9)).isEqualTo("Jumping!!");
    }

    @Test
    void jumpNumberTes2() {
        assertThat(JumpingNumber.solve(23)).isEqualTo("Jumping!!");
    }

    @Test
    void jumpNumberTes3() {
        assertThat(JumpingNumber.solve(79)).isEqualTo("Not!!");
    }
}
