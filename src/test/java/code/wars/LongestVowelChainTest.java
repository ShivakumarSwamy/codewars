package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LongestVowelChainTest {

    @Test
    void basicTest1() {
        assertThat(LongestVowelChain.solve("codeWarriors"))
                .isEqualTo(2);
    }

    @Test
    void basicTest2() {
        assertThat(LongestVowelChain.solve("ultrarevolutionariees"))
                .isEqualTo(3);
    }

    @Test
    void basicTest3() {
        assertThat(LongestVowelChain.solve(""))
                .isZero();
    }

    @Test
    void basicTest4() {
        assertThat(LongestVowelChain.solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"))
                .isEqualTo(11);
    }
}
