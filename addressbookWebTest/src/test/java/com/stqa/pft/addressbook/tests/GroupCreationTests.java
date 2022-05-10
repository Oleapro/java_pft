package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


  @Test
  public void testCreateNewGroup() throws Exception {

    app.getNavigationHelper().go_toGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test1", "test", null));

  }

}
