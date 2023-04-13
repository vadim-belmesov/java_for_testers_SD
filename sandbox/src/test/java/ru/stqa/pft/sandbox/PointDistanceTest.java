package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.point_distace.Point;

public class PointDistanceTest {
  @Test
  public void DistanceTest_X2Y2(){
    double x1=8;
    double y1=-1;
    Point p = new Point(x1,y1);

    double x2=4;
    double y2=2;

    Assert.assertEquals(p.p2(x2,y2),50);

  }
  @Test
  public void DistanceTest_X1Y1(){
    double x1=8;
    double y1=-1;
    Point p = new Point(x1,y1);

    double x2=4;
    double y2=2;

    Assert.assertEquals(p.p2(x2,y2),5.0);
  }
}
