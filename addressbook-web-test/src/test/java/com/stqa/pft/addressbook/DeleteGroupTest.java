package com.stqa.pft.addressbook;

import org.testng.annotations.*;

public class DeleteGroupTest extends TestBase {

  @Test
  public void testDeleteGroup() {
    go_toGroupPage();
    selectGroup();
    deleteSelectedGroups();
    return_toGroupPage();
  }


}
