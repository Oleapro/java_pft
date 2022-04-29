package com.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase{


  @Test
  public void testDeleteGroup() throws Exception {
    go_toGroupPage();
    selectGroup();
    deleteSelectedGroup();
    returnToGroupPage();
  }


}
