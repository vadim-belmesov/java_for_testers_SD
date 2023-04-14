package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.point_distace.Point;

public class PointDistanceTest {
  @Test
  public void DistanceTest_X2Y2(){
    double x1=155;
    double y1=-100;
    Point p1 = new Point(x1,y1);

    double x2=4;
    double y2=2;
    Point p2 = new Point(x2,y2);

    Assert.assertEquals(p1.distance(p2),182.22239159883728);

  }
  @Test
  public void DistanceTest_X1Y1(){
    double x1=8;
    double y1=-1;
    Point p1 = new Point(x1,y1);

    double x2=4;
    double y2=2;
    Point p2 = new Point(x2,y2);

    Assert.assertEquals(p1.distance(p2),5.0);
  }
}
