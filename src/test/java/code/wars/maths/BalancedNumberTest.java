package code.wars.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BalancedNumberTest {

    @Test
    void checkBalancedNumber() {
        assertThat(BalancedNumber.balancedNum(7))
                .isEqualTo("Balanced");
    }

    @Test
    void checkBalancedNumber2() {
        assertThat(BalancedNumber.balancedNum(33))
                .isEqualTo("Balanced");
    }

    @Test
    void checkBalancedNumber3() {
        assertThat(BalancedNumber.balancedNum(12345))
                .isEqualTo("Not Balanced");
    }

    @Test
    void checkBalancedNumber4() {
        assertThat(BalancedNumber.balancedNum(1245))
                .isEqualTo("Not Balanced");
    }

    @Test
    void checkBalancedNumber5() {
        assertThat(BalancedNumber.balancedNum(121))
                .isEqualTo("Balanced");
    }

    @Test
    void checkBalancedNumber6() {
        assertThat(BalancedNumber.balancedNum(1221))
                .isEqualTo("Balanced");
    }
}
