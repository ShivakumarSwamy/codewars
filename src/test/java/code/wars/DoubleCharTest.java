package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DoubleCharTest {

    @Test
    void sampleTest() {
        assertThat(DoubleChar.solve("String"))
                .isEqualTo("SSttrriinngg");
    }

    @Test
    void sampleTest2() {
        assertThat(DoubleChar.solve("Hello World"))
                .isEqualTo("HHeelllloo  WWoorrlldd");
    }

    @Test
    void sampleTest3() {
        assertThat(DoubleChar.solve("1234!_ "))
                .isEqualTo("11223344!!__  ");
    }
}
