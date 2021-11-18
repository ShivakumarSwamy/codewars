package code.wars.patterns;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FoodFactoryTest {

    @Test
    void test1() {
        Food cake = FoodFactory.getFood("cake");

        assertThat(cake).isExactlyInstanceOf(Cake.class);
    }

    @Test
    void test2() {;
        Food cake = FoodFactory.getFood("cake");

        assertThat(cake.getType()).isEqualTo("Someone ordered a Dessert!");
    }

    @Test
    void test3() {
        Food pizza = FoodFactory.getFood("pizza");

        assertThat(pizza).isExactlyInstanceOf(Pizza.class);
    }

    @Test
    void test4() {
        Food pizza = FoodFactory.getFood("pizza");

        assertThat(pizza.getType()).isEqualTo("Someone ordered Fast Food!");
    }

    @Test
    void test5() {

        assertThatThrownBy(() -> FoodFactory.getFood("unknown"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
