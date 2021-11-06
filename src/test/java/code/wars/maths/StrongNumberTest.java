package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StrongNumberTest {

    @Test
    void testSomething1() {

        assertThat(StrongNumber.isStrongNumber(145))
                .isEqualTo("STRONG!!!!");
    }

    @Test
    void testSomething2() {

        assertThat(StrongNumber.isStrongNumber(185))
                .isEqualTo("Not Strong !!");
    }
}
