package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AutomorphicNumberTest {

    @Test
    void test1() {
        assertThat(AutomorphicNumber.solve(1))
                .isEqualTo("Automorphic");
    }

    @Test
    void test2() {
        assertThat(AutomorphicNumber.solve(9))
                .isEqualTo("Not!!");
    }

    @Test
    void test3() {
        assertThat(AutomorphicNumber.solve(625))
                .isEqualTo("Automorphic");
    }
}
