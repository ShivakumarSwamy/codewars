package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EvenOrOddTest {

    @Test
    void testEvenOrOdd() {
        assertThat(EvenOrOdd.evenOrOdd(6)).isEqualTo("Even");
    }

    @Test
    void testEvenOrOdd2() {
        assertThat(EvenOrOdd.evenOrOdd(7)).isEqualTo("Odd");
    }
}
