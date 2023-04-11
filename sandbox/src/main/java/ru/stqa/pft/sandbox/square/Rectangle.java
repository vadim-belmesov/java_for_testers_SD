package ru.stqa.pft.sandbox.square;

public class Rectangle {
  public double a;
  public double b;
  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }
  //Метод  вычисления площади рямоугольнка
  public double area(){
    return this.a * this.b;
  }
}
