package com.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase {

  @Test
  public void testDeleteContact() {
    app.getNavigationHelper().go_toContactsHomePage();
    app.getContactHelper().selectContact();
    //app.acceptNextAlert = true;
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().assertTrueContactDelete();
    System.out.println("Deleted");
    app.getNavigationHelper().go_toContactsHomePage();


  }



}
