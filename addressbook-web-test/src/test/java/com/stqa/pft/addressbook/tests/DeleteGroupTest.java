package com.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class DeleteGroupTest extends TestBase {

  @Test
  public void testDeleteGroup() {
    app.getNavigationHelper().go_toGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().return_toGroupPage();
  }


}
