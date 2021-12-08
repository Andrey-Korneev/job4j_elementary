package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.rubleToEuro(1000);
        System.out.println("1000 rubles are " + euro + " euro.");
        float dollars = Converter.rubleToDollar(540);
        System.out.println("540 rubles are " + dollars + " dollars.");
        dollars = Converter.rubleToDollar(2000);
        System.out.println("2000 rubles are " + dollars + " dollars.");
    }
}
