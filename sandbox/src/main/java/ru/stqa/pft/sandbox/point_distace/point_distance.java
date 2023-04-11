package ru.stqa.pft.sandbox.point_distace;
import ru.stqa.pft.sandbox.point_distace.Point;

/*
Задание №2: Потренироваться использовать функции, классы, объекты и методы (После лекции 1.9)
1. Создать класс Point для представления точек на двумерной плоскости.
Объекты этого класса должны содержать два атрибута, которые соответствуют координатам точки на плоскости.
2. Создать функцию public static double distance(Point p1, Point p2) которая вычисляет расстояние между двумя точками.
Для вычисления квадратного корня можно использовать функцию Math.sqrt
////distance = sqrt((p2.x - p1.x)2 + (p2.y - p1.y)2)
3. Сделать запускаемый класс, то есть содержащий функцию public static void main(String[] args) {...} и при помощи него убедиться, что функция вычисления расстояния между точками действительно работает.
Результат вычисления выводить на экран и контролировать визуально.
4. Реализовать то же самое (вычисление расстояния между двумя точками) при помощи метода в классе Point, и добавить в созданный в предыдущем пункте запускаемый класс примеры использования метода вместо ранее созданной функции.
*/
public class point_distance {
  public static void main(String[] args) {
    Point p1 = new Point();
    p1.x = 8;
    p1.y = -1;

    Point p2 = new Point();
    p2.x = 4;
    p2.y = 2;

    System.out.println("Distance = " + distance(p1, p2));

  }
  public static double distance (Point p1, Point p2){
    return Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
  }
}
