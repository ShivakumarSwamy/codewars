package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AlphabetSymmetryTest {

    @Test
    void sampleTest1() {
        assertThat(AlphabetSymmetry.solve(new String[] { "abode", "ABc", "xyzD" }))
                .containsExactly(4, 3, 1);
    }
}
