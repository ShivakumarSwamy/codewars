package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BuildASquareTest {

    @Test
    void test1() {
        assertThat(BuildASquare.generateShape(3))
                .isEqualTo("+++\n+++\n+++");
    }

    @Test
    void test2() {
        assertThat(BuildASquare.generateShape(5))
                .isEqualTo("+++++\n+++++\n+++++\n+++++\n+++++");
    }
}
