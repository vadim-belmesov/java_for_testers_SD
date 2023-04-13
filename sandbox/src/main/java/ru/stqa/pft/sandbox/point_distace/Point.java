package ru.stqa.pft.sandbox.point_distace;
public class Point {
  public double x;
  public double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }
  public double p2(double x, double y){
    return Math.sqrt(Math.pow((x - this.x),2) + Math.pow((y - this.y),2));
  }
}
//  sqrt((p2.x - p1.x)2 + (p2.y - p1.y)2)