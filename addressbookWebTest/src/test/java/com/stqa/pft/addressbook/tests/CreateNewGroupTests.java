package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class CreateNewGroupTests extends TestBase {


  @Test
  public void testCreateNewGroup() throws Exception {

    app.getNavigationHelper().go_toGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillNewGroupForm(new GroupData("NewGroup2", "test", "test"));
    app.getGroupHelper().submitGroupCreation();

  }

}
