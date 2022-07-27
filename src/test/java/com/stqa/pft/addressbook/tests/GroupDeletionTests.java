package com.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase{


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup();
      app.getGroupHelper().returnToGroupPage();
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }


}
