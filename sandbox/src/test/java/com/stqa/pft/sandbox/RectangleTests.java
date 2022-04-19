package com.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTests {

  @Test
  public  void testArea(){
    Rectangle r = new Rectangle(4,6);
    Assert.assertEquals( r.areaRct(), 24);
  }
}
