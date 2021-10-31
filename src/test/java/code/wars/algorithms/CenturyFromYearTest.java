package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CenturyFromYearTest {

    @Test
    void fixedTests() {
        assertThat(CenturyFromYear.century(1705))
                .isEqualTo(18);
    }

    @Test
    void fixedTests2() {
        assertThat(CenturyFromYear.century(2000))
                .isEqualTo(20);
    }
}
