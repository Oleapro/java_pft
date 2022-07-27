package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.*;

import static org.testng.Assert.fail;

public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("NewGroup", "teest1", "test2"));
    app.getGroupHelper().submitGroutCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
