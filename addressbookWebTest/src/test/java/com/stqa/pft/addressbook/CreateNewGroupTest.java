package com.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class CreateNewGroupTest extends  TestBase{


  @Test
  public void testCreateNewGroup() throws Exception {

    go_toGroupPage();
    initGroupCreation();
    fill_inNewGroupForm(new GroupData("NewGroup2", "test", "test"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
