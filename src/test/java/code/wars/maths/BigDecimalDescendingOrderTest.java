package code.wars.maths;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BigDecimalDescendingOrderTest {

    @Test
    void test1() {
        List<String> bigDecimals = new ArrayList<>();
        bigDecimals.add("9");
        bigDecimals.add("-100");
        bigDecimals.add("50");

        assertThat(BigDecimalDescendingOrder.solve(bigDecimals))
                .containsExactly("50", "9","-100")
        ;
    }
}
