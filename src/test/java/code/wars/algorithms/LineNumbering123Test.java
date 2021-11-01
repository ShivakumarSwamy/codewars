package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class LineNumbering123Test {

    @Test
    void basicTests() {
        assertThat(LineNumbering123.number(Collections.emptyList()))
                .isEmpty();
    }

    @Test
    void basicTest2() {
        assertThat(LineNumbering123.number(Arrays.asList("a", "b", "c")))
                .containsExactly("1: a", "2: b", "3: c");
    }
}
