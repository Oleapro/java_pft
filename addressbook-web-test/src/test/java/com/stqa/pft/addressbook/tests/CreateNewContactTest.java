package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.NewContactData;
import org.testng.annotations.*;

public class CreateNewContactTest extends TestBase {



  @Test
  public void testCreateNewContact() {
    app.getContactHelper().initNewContactCreation();
    app.getContactHelper().fill_inNewContactForm(new NewContactData("Olga", "Pr", "2064 Arbor Springs Way Buford GA 30519", "5186189573"));
    app.getContactHelper().submitContactCreation();
    app.return_toHomePage();
    System.out.println("contact created");

  }


}
