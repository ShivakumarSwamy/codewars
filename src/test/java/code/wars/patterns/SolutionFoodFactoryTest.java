package code.wars.patterns;

import java.util.Scanner;

public class SolutionFoodFactoryTest {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
//            Food food = FoodFactory.getFood(scanner.nextLine());
            FoodLocal food = FoodFactoryLocal.getFood(scanner.nextLine());
            System.out.println("The factory returned class " + food.getClass().getSimpleName());
            System.out.println(food.getType());
        }
    }

    static class FoodFactoryLocal {

        static FoodLocal getFood(String food) {
            if ("cake".equals(food)) {
                return new CakeLocal();
            } else if ("pizza".equals(food)) {
                return new PizzaLocal();
            }
            throw new IllegalArgumentException();
        }
    }

    interface FoodLocal {

        String getType();
    }

    static class CakeLocal implements FoodLocal {

        @Override
        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    static class PizzaLocal implements FoodLocal {

        @Override
        public String getType() {
            return "Someone ordered Fast Food!";
        }
    }
}
