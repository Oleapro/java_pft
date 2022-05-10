package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class DeleteGroupTests extends TestBase {


  @Test
  public void testDeleteGroup() throws Exception {
    app.getNavigationHelper().go_toGroupPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }


}
