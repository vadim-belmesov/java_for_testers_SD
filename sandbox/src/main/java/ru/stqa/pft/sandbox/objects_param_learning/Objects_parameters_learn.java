package ru.stqa.pft.sandbox.objects_param_learning;

public class Objects_parameters_learn {
  public static void main(String[] args) {
    //Квадрат
    Square_func squar = new Square_func();
    squar.l = 3;
    System.out.println("Площадь квадрата со стороной " + squar.l + " = " + area(squar)); //s.area() обращаемся к методу объекта s через точку

    //Прямоугольник
    Rectangle_func rect = new Rectangle_func();
    rect.a = 3;
    rect.b = 5;

    System.out.println("Площадь прямоугольника со сторонами " + rect.a + " и " + rect.b + " равна = " + area(rect));
  }

  public static double area(Square_func squar) {
    return squar.l * squar.l;
  }
  public static double area(Rectangle_func rect) {
    return rect.a * rect.b;
  }
}