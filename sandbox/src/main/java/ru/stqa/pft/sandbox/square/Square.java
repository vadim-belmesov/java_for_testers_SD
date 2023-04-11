package ru.stqa.pft.sandbox.square;

public class Square {
  public double l;
  public Square(double len){

    this.l = len;
  }
  //Ф-я Вычисление площади квадрата
  public double area() {
    return this.l * this.l;
  }
}

