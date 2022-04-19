package com.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTests {
  @Test
  public  void  testArea(){
    Circle c  = new Circle(5);
    Assert.assertEquals(c.areaCrc(),78.53981633974483);
  }

}
