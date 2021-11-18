package code.wars.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class TwoDArrayHourGlassSumTest {

    @Test
    void test1() {
        List<List<Integer>> arrayMatrix = List.of(
                List.of(-9, -9, -9, 1, 1, 1),
                List.of(0, -9, 0, 4, 3, 2),
                List.of(-9, -9, -9, 1, 2, 3),
                List.of(0, 0, 8, 6, 6, 0),
                List.of(0, 0, 0, -2, 0, 0),
                List.of(0, 0, 1, 2, 4, 0)
        );
        assertThat(TwoDArrayHourGlassSum.hourGlassSum(arrayMatrix))
                .isEqualTo(28);
    }

    @Test
    void test2() {
        List<List<Integer>> arrayMatrix = List.of(
                List.of(1, 1, 1, 0, 0, 0),
                List.of(0, 1, 0, 0, 0, 0),
                List.of(1, 1, 1, 0, 0, 0),
                List.of(0, 0, 2, 4, 4, 0),
                List.of(0, 0, 0, 2, 0, 0),
                List.of(0, 0, 1, 2, 4, 0)
        );
        assertThat(TwoDArrayHourGlassSum.hourGlassSum(arrayMatrix))
                .isEqualTo(19);
    }
}
