package com.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ContactDeletionTests extends TestBase{



  @Test
  public void testContactDeletion() throws Exception {
    app.getContactHelper().selectContact();
    app.getContactHelper().acceptNextAlert = true;
    app.getContactHelper().deleteSelectedContact();
    assertTrue(app.getContactHelper().closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    app.getNavigationHelper().gotoHomePage();
  }


}
