package ru.stqa.pft.sandbox;

public class MyFirstApp {

    public static void main(String[] args) {
        //Описание объектов
        Square s = new Square(5); //создаём объект s типа Square
//        s.l = 5;актуально, когда не используется конструктор
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(2, 3); //создаём объект r типа Rectangle
//        r.a = 2; актуально, когда не используется конструктор
//        r.b = 3;актуально, когда не используется конструктор
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна = " + area(r));
    }
    //Ф-я Вычисление площади квадрата
    public static double area(Square s){
        return s.l * s.l;
    }
    //Ф-я  вычисление площади рямоугольнка
    public static double area(Rectangle r){
        return r.a * r.b;
    }

}