package com.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {


  @Test
  public void testDeleteGroup() throws Exception {
    app.go_toGroupPage();
    app.selectGroup();
    app.deleteSelectedGroup();
    app.returnToGroupPage();
  }


}
