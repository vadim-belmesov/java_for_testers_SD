package ru.stqa.pft.sandbox.functions;

public class functions {
    public static void main(String[] args) {
        hello("Alex");

        //Вычисление площади квадрата
        double len = 10; //
        System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

        //Вычисление площади прямоугольника
        double a = 3;
        double b = 5;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна = " + area(a, b));
    }
    public static void hello (String some_string) {
        System.out.println("Hello, " + some_string + "!");
    }

    public static double area (double l) { //площадь квадрата
        return l * l;
    }
    public static double area (double a, double b) { //площадь прямоугольника по параметрам
        return a * b;
    }


}