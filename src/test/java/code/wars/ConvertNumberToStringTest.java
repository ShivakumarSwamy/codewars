package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ConvertNumberToStringTest {

    @Test
    void tests() {
        assertThat(ConvertNumberToString.numberToString(67))
                .isEqualTo("67");
    }

    @Test
    void tests2() {
        assertThat(ConvertNumberToString.numberToString(123))
                .isEqualTo("123");
    }
}
