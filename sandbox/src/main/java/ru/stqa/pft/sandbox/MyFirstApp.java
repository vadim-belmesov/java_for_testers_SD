package ru.stqa.pft.sandbox;

import ru.stqa.pft.sandbox.square.Rectangle;
import ru.stqa.pft.sandbox.square.Square;

public class MyFirstApp {
    public static void main(String[] args) {
        //Квадрат
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area()); //s.area() обращаемся к методу объекта s через точку

        //Прямоугольник
        Rectangle r = new Rectangle(2, 3);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна = " + r.area());
    }
}