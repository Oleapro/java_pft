package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class MoveContactToGroupTests extends TestBase{
  @Test
  public void testAddContactToGroup(){
    if (!app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("Olga4", "Pro", "2064 Arbor Way Buford GA 30519", "5186189573", "test1"), true);
    }
    //app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactMove();
    app.getContactHelper().addContactToSelectedGroup();
    app.getContactHelper().goToGroupWithContactAddedPage();
    app.getNavigationHelper().goToHomePage();

  }

}
