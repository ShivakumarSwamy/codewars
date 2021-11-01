package code.wars;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TwoHighestValuesInListTest {

    @Test
    void testSomething() {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(20);
        list.add(20);
        list.add(17);
        assertThat(TwoHighestValuesInList.solve(list))
                .containsExactly(20, 17);
    }

    @Test
    void testSomething2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        assertThat(TwoHighestValuesInList.solve(list))
                .containsExactly(1);
    }

    @Test
    void testSomething3() {
        List<Integer> list = new ArrayList<>();
        assertThat(TwoHighestValuesInList.solve(list))
                .isEmpty();
    }

    @Test
    void testSomething4() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(10);
        list.add(9);
        assertThat(TwoHighestValuesInList.solve(list))
                .containsExactly(10, 9);
    }
}
