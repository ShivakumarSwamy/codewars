package code.wars.patterns;

public class FoodFactory {

    public static Food getFood(String food) {

        if ("cake".equals(food)) {
            return new Cake();
        } else if ("pizza".equals(food)) {
            return new Pizza();
        }
        throw new IllegalArgumentException();
    }
}
