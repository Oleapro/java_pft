package com.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void  testDistance(){
    Point p1 = new Point(5,8);
    Point p2 = new Point(4,3);
    Assert.assertEquals(p1.distance(p2),5.0990195135927845);
  }
}
