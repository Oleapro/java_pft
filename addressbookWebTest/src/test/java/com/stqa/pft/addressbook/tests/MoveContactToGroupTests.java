package com.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class MoveContactToGroupTests extends TestBase{
  @Test
  public void testAddContactToGroup(){
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactMove();
    app.getContactHelper().addContactToSelectedGroup();
    app.getContactHelper().goToGroupWithContactAdedPage();
    app.getNavigationHelper().returnToHomePage();

  }

}
