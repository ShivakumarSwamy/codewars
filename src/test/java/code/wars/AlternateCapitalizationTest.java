package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AlternateCapitalizationTest {

    @Test
    void basicTests() {
        assertThat(AlternateCapitalization.capitalize("abcdef"))
                .containsExactly("AbCdEf", "aBcDeF");
    }

    @Test
    void basicTest2() {
        assertThat(AlternateCapitalization.capitalize("codewars"))
                .containsExactly("CoDeWaRs", "cOdEwArS");
    }

    @Test
    void basicTest3() {
        assertThat(AlternateCapitalization.capitalize("abracadabra"))
                .containsExactly("AbRaCaDaBrA", "aBrAcAdAbRa");
    }

    @Test
    void basicTests4() {
        assertThat(AlternateCapitalization.capitalize("codewarriors"))
                .containsExactly("CoDeWaRrIoRs", "cOdEwArRiOrS");
    }
}
