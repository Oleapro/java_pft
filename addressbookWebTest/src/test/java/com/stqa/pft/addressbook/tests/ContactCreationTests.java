package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testCreateNewContact() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fill_inNewContactForm(new ContactData("Olga4", "Pro", "2064 Arbor Way Buford GA 30519", "5186189573", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomePage();
  }

}
