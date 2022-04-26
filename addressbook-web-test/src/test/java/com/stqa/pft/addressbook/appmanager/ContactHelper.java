package com.stqa.pft.addressbook.appmanager;

import com.stqa.pft.addressbook.model.NewContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertTrue;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void fill_inNewContactForm(NewContactData newContactData) {
    executeContactAction(By.name("firstname"), newContactData.firstName());
    executeContactAction(By.name("lastname"), newContactData.lastName());
    executeContactAction(By.name("address"), newContactData.address());
    executeContactAction(By.name("mobile"), newContactData.phoneNumber());
  }

  public void initNewContactCreation() {
    click(By.linkText("add new"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void selectContact() {
    //click(By.cssSelector("input[name=\"selected[]\"]:first-of-type"));
    click(By.name("selected[]"));
  }
  public void assertTrueContactDelete() {
    assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
  }

}
