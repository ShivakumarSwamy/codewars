package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class JavaStringsTest {

    @Test
    void test1() {
        assertThat(JavaStrings.sum("", ""))
                .isZero();
    }

    @Test
    void test2() {
        assertThat(JavaStrings.sum("Adam", "Sony"))
                .isEqualTo(8);
    }

    @Test
    void test3() {
        assertThat(JavaStrings.aGreaterThanB("Adam", "Sony"))
                .isEqualTo("No");
    }

    @Test
    void test4() {
        assertThat(JavaStrings.aGreaterThanB("Sony", "Adam"))
                .isEqualTo("Yes");
    }

    @Test
    void test5() {
        assertThat(JavaStrings.capitalizeAB("sony", "adam"))
                .isEqualTo("Sony Adam");
    }
}
