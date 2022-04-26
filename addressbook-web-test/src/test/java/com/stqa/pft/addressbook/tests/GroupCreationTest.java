package com.stqa.pft.addressbook.tests;


import com.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.*;


public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().go_toGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("NewGroup2", "test", "test"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().return_toGroupPage();
  }

}
