package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TwiceAsOldTest {

    @Test
    void testSomething() {
        assertThat(TwiceAsOld.twiceAsOld(30, 0))
                .isEqualTo(30);
    }

    @Test
    void testSomething2() {
        assertThat(TwiceAsOld.twiceAsOld(30, 7))
                .isEqualTo(16);
    }

    @Test
    void testSomething3() {
        assertThat(TwiceAsOld.twiceAsOld(45, 30))
                .isEqualTo(15);
    }
}
