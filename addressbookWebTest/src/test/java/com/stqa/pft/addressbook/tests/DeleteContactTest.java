package com.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase {


  @Test
  public void testDeleteContact() throws Exception {

    app.getContactHelper().selectContact();
    app.acceptNextAlert = true;
    app.getContactHelper().deleteSelectedContact();
    app.assertTrueContactDelete();
    //app.getNavigationHelper().returnToHomePage();

  }

}
