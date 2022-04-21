package com.stqa.pft.addressbook;


import org.testng.annotations.*;


public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() {
    go_toGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("NewGroup2", "test", "test"));
    submitGroupCreation();
    return_toGroupPage();
  }

}
