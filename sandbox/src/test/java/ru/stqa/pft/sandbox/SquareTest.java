package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.square.Square;


public class SquareTest {
  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25.0);
  }
}
