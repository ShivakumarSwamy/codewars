package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class YesNoBooleanStringTest {

    @Test
    void testBoolToWord() {
        assertThat(YesNoBooleanString.boolToWord(true))
                .isEqualTo("Yes");
    }

    @Test
    void testBoolToWord2() {
        assertThat(YesNoBooleanString.boolToWord(false))
                .isEqualTo("No");
    }
}
