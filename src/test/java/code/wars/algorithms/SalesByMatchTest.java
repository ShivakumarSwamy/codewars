package code.wars.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SalesByMatchTest {

    @Test
    void test1() {
        List<Integer> ar = new java.util.ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

        assertThat(SalesByMatch.sockMerchant(9, ar))
                .isEqualTo(3);
    }
}
