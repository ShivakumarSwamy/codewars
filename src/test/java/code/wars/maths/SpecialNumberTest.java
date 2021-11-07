package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SpecialNumberTest {

    @Test
    void checkSingleDigitNumberTest() {

        assertThat(SpecialNumber.solve(2))
                .isEqualTo("Special!!");
    }

    @Test
    void checkSingleDigitNumberTest2() {

        assertThat(SpecialNumber.solve(9))
                .isEqualTo("NOT!!");
    }

    @Test
    void checkSingleDigitNumberTest3() {

        assertThat(SpecialNumber.solve(384297))
                .isEqualTo("NOT!!");
    }
}
