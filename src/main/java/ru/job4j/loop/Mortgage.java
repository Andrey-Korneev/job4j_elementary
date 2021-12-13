package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double debt = amount + amount * percent / 100;
        while (debt > 0) {
            amount = debt - salary;
            debt = amount + amount * percent / 100;
            year++;
        }
        return year;
    }
}
