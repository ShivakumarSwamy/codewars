package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CreatePhoneNumberTest {

    @Test
    void tests() {

        assertThat(CreatePhoneNumber.solve(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }))
                .isEqualTo("(123) 456-7890");
    }
}
