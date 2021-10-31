package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TVRemoteTest {

    @Test
    void example1() {
        assertThat(TVRemote.tvRemote("codewars"))
                .isEqualTo(36);
    }

    @Test
    void example2() {
        assertThat(TVRemote.tvRemote("does"))
                .isEqualTo(16);
    }

    @Test
    void example3() {
        assertThat(TVRemote.tvRemote("your"))
                .isEqualTo(23);
    }

    @Test
    void example4() {
        assertThat(TVRemote.tvRemote("so"))
                .isEqualTo(10);
    }
}
