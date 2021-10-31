package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ReverseWordsTest {

    @Test
    void testSomething() {
        assertThat(ReverseWords.reverseWords("I like eating"))
                .isEqualTo("eating like I");
    }

    @Test
    void testSomething1() {
        assertThat(ReverseWords.reverseWords("I like flying"))
                  .isEqualTo("flying like I");
    }

    @Test
    void testSomething2() {
        assertThat(ReverseWords.reverseWords(""))
                .isEmpty();
    }
}
