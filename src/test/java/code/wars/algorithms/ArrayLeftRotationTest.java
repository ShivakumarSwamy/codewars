package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class ArrayLeftRotationTest {

    @Test
    void test1() {

        List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        assertThat(ArrayLeftRotation.rotLeft(numbers, 4))
                .containsExactly(5, 1, 2, 3, 4);
    }

    @Test
    void test2() {

        List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        assertThat(ArrayLeftRotation.rotLeft(numbers, 2))
                .containsExactly(3, 4, 5, 1, 2);
    }
}
