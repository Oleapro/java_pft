package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
  @Test
  public void TestContactModification(){
    app.getNavigationHelper().goToHomePage();
    if (!app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("Olga4", "Pro", "2064 Arbor Way Buford GA 30519", "5186189573", "test1"), true);
    }
    app.getContactHelper().contactModification();
    app.getNavigationHelper().goToHomePage();
  }
}
