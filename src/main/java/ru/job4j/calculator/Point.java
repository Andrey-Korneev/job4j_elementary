package ru.job4j.calculator;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(5, -3, 1, 3);
        System.out.println("result (5, -3) to (1, 3) " + result);
        result = Point.distance(4, 8, -2, 6);
        System.out.println("result (4, 8) to (-2, 6) " + result);
        result = Point.distance(2, 5, 7, 11);
        System.out.println("result (2, 5) to (7, 11) " + result);
    }
}
