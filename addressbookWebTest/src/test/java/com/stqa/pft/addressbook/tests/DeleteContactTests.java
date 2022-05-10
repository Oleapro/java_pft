package com.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase {


  @Test
  public void testDeleteContact() throws Exception {

    app.getContactHelper().selectContact();
    app.getContactHelper().acceptNextAlert = true;
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().closeAlertAndGetItsText();
    app.getNavigationHelper().goToHomePage();

  }

}
