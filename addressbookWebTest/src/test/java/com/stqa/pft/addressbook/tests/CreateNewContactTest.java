package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class CreateNewContactTest extends TestBase {

  @Test
  public void testCreateNewContact() throws Exception {
    app.initContactCreation();
    app.fill_inNewContactForm(new ContactData("Olga", "Pro", "2064 Arbor Way Buford GA 30519", "5186189573"));
    app.submitContactCreation();
    app.returnToHomePage();
  }

}
