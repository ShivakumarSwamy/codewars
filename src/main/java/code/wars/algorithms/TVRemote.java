package code.wars.algorithms;

import java.util.HashMap;
import java.util.Map;

public class TVRemote {

    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }


    public static int tvRemote(String word) {
        return tvRemote2(word);
    }

    private static int tvRemote1(String word) {
        Map<Character, Point> keyBoardLayout = new HashMap<>();
        keyBoardLayout.put('a', new Point(0, 0));
        keyBoardLayout.put('b', new Point(0, 1));
        keyBoardLayout.put('c', new Point(0, 2));
        keyBoardLayout.put('d', new Point(0, 3));
        keyBoardLayout.put('e', new Point(0, 4));
        keyBoardLayout.put('1', new Point(0, 5));
        keyBoardLayout.put('2', new Point(0, 6));
        keyBoardLayout.put('3', new Point(0, 7));

        keyBoardLayout.put('f', new Point(1, 0));
        keyBoardLayout.put('g', new Point(1, 1));
        keyBoardLayout.put('h', new Point(1, 2));
        keyBoardLayout.put('i', new Point(1, 3));
        keyBoardLayout.put('j', new Point(1, 4));
        keyBoardLayout.put('4', new Point(1, 5));
        keyBoardLayout.put('5', new Point(1, 6));
        keyBoardLayout.put('6', new Point(1, 7));

        keyBoardLayout.put('k', new Point(2, 0));
        keyBoardLayout.put('l', new Point(2, 1));
        keyBoardLayout.put('m', new Point(2, 2));
        keyBoardLayout.put('n', new Point(2, 3));
        keyBoardLayout.put('o', new Point(2, 4));
        keyBoardLayout.put('7', new Point(2, 5));
        keyBoardLayout.put('8', new Point(2, 6));
        keyBoardLayout.put('9', new Point(2, 7));

        keyBoardLayout.put('p', new Point(3, 0));
        keyBoardLayout.put('q', new Point(3, 1));
        keyBoardLayout.put('r', new Point(3, 2));
        keyBoardLayout.put('s', new Point(3, 3));
        keyBoardLayout.put('t', new Point(3, 4));
        keyBoardLayout.put('.', new Point(3, 5));
        keyBoardLayout.put('@', new Point(3, 6));
        keyBoardLayout.put('0', new Point(3, 7));

        keyBoardLayout.put('u', new Point(4, 0));
        keyBoardLayout.put('v', new Point(4, 1));
        keyBoardLayout.put('w', new Point(4, 2));
        keyBoardLayout.put('x', new Point(4, 3));
        keyBoardLayout.put('y', new Point(4, 4));
        keyBoardLayout.put('z', new Point(4, 5));
        keyBoardLayout.put('_', new Point(4, 6));
        keyBoardLayout.put('/', new Point(4, 7));

        Point initialPoint = keyBoardLayout.get('a');
        int buttonPresses = 0;
        for (char c : word.toCharArray()) {
            buttonPresses += calculateDistance(initialPoint, keyBoardLayout.get(c));
            initialPoint = keyBoardLayout.get(c);
        }

        return buttonPresses;
    }


    private static int calculateDistance(Point x12, Point x34) {
        return Math.abs(x34.getX() - x12.getX()) + Math.abs(x34.getY() - x12.getY()) + 1;
    }

    private static int tvRemote2(String word) {

        String keyBoardLayout = "abcde123fghij456klmno789pqrst.@0uvwxyz_/";

        int prevX = 0;
        int prevY = 0;
        int buttonPresses = 0;
        for (char c : word.toCharArray()) {
            int index = keyBoardLayout.indexOf(c);
            int x = index / 8;
            int y = index % 8;
            buttonPresses += Math.abs(x - prevX) + Math.abs(y - prevY) + 1;
            prevX = x;
            prevY = y;
        }

        return buttonPresses;
    }

}
