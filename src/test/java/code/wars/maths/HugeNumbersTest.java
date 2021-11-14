package code.wars.maths;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HugeNumbersTest {

    @Test
    void test1() {
        assertThat(HugeNumbers.sum("8765432", "8907654321"))
                .isEqualTo("8916419753");
    }

    @Test
    void test2() {
        assertThat(HugeNumbers.multiply("8765432", "8907654321"))
                .isEqualTo("78079438230231672");
    }
}
