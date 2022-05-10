package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;


public class GroupModificationTests extends TestBase{

  @Test
  public void testGroupModification (){
    app.getNavigationHelper().go_toGroupPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("NewGroup2", "test", "test"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }

}
