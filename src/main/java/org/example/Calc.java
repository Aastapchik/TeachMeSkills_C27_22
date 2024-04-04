package org.example;

public class Calc {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double diff(double a, double b) {
        return a - b;
    }

    public static double prod(double a, double b) {
        return a * b;
    }

    public static double quotient(double a, double b) {
        try {
            return a/b;
        } catch (Exception e) {
            System.out.println("Деление на ноль невозможно.");
        }
        return 0;
    }
}
