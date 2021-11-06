package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DisariumNumberTest {

    @Test
    void disariumTest() {

        assertThat(DisariumNumber.solve(89))
                .isEqualTo("Disarium !!");
    }

    @Test
    void disariumTest2() {

        assertThat(DisariumNumber.solve(64599))
                .isEqualTo("Not !!");
    }
}
