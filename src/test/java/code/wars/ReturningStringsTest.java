package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ReturningStringsTest {

    @Test
    void testSomething() {
        assertThat(ReturningStrings.greet("Ryan")).isEqualTo("Hello, Ryan how are you doing today?");
    }

    @Test
    void testSomething2() {
        assertThat(ReturningStrings.greet("Choose")).isEqualTo("Hello, Choose how are you doing today?");
    }
}
