package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class CreateNewGroupTest extends TestBase {


  @Test
  public void testCreateNewGroup() throws Exception {

    app.getNavigationHelper().go_toGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fill_inNewGroupForm(new GroupData("NewGroup2", "test", "test"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
