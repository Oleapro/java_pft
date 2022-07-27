package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Olga", "Pro", "12345"));
    app.getContactHelper().submitContactCreation();


  }


}
