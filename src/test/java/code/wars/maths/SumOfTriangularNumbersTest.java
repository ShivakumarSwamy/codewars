package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SumOfTriangularNumbersTest {

    @Test
    void basicTests() {

        assertThat(SumOfTriangularNumbers.sum(1))
                .isEqualTo(1);
    }


    @Test
    void basicTests2() {

        assertThat(SumOfTriangularNumbers.sum(6))
                .isEqualTo(56);
    }

    @Test
    void basicTests3() {

        assertThat(SumOfTriangularNumbers.sum(-97))
                .isZero();
    }

}
