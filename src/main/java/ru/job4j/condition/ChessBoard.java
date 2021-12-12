package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        boolean coordIsNegative = x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0;
        boolean coordIsLarge = x1 > 7 || x2 > 7 || y1 > 7 || y2 > 7;
        if (coordIsNegative || coordIsLarge) {
            return 0;
        }
        int deltaX = Math.abs(x2 - x1);
        if (deltaX == Math.abs(y2 - y1)) {
            return deltaX;
        }
        return 0;
    }
}
