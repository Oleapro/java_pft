package com.stqa.pft.addressbook;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class CreateNewContactTest extends TestBase {

  @Test
  public void testCreateNewContact() throws Exception {
    initContactCreation();
    fill_inNewContactForm(new ContactData("Olga", "Pro", "2064 Arbor Way Buford GA 30519", "5186189573"));
    submitContactCreation();
    returnToHomePage();
  }

}
