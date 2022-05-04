package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class CreateNewContactTests extends TestBase {

  @Test
  public void testCreateNewContact() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fill_inNewContactForm(new ContactData("Olga4", "Proko", "2064 Arbor Way Buford GA 30519", "5186189573"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
  }

}