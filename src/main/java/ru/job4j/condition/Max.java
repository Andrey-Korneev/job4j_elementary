package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return max(temp, third);
    }

    public static int max(int first, int second, int third, int forth) {
        int temp = max(first, second, third);
        return max(temp, forth);
    }
}
