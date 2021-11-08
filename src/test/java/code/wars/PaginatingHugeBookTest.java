package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PaginatingHugeBookTest {

    @Test
    void test1() {
        assertThat(PaginatingHugeBook.solve(12)).isEqualTo(15);
    }

    @Test
    void test2() {
        assertThat(PaginatingHugeBook.solve(100)).isEqualTo(192);
    }

    @Test
    void test3() {
        assertThat(PaginatingHugeBook.solve(1000)).isEqualTo(2893);
    }
}
