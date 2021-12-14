package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Andrey Korneev";
        names[1] = "Billy Bons";
        names[2] = "Jimmy Hokkins";
        names[3] = "John Silver";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
