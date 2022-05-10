package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase {


  @Test
  public void testDeleteContact() throws Exception {
    if (!app.getContactHelper().isThereAContact()) {

      app.getContactHelper().createContact(new ContactData("Olga4", "Pro", "2064 Arbor Way Buford GA 30519", "5186189573", "test1"), true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().acceptNextAlert = true;
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().closeAlertAndGetItsText();
    app.getNavigationHelper().goToHomePage();

  }

}
