package code.wars;

public class ReturningStrings {
    public static String greet(String name) {
        return greet2(name);
    }

    private static String greet1(String name) {
        return "Hello, " + name + " how are you doing today?";
    }

    private static String greet2(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }
}
