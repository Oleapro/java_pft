package com.stqa.pft.addressbook.appmanager;

import com.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase {

  public boolean acceptNextAlert = true;

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void fill_inNewContactForm(ContactData contactData, boolean creation) {
    setFieldValue(By.name("firstname"), contactData.firstName());
    setFieldValue(By.name("lastname"), contactData.lastName());
    setFieldValue(By.name("address"), contactData.address());
    setFieldValue(By.name("mobile"), contactData.phoneNumber());

//    if (creation){
//      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.group());
//    } else {
//      Assert.assertFalse(isElementPresent(By.name("new_group")));
//    }

  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void closeAlertAndGetItsText() {
    driver.switchTo().alert().accept();
    /*try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

  public void assertTrueContactDelete() {
    assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));*/
  }


  public void initContactMove() {
    new Select(driver.findElement(By.name("to_group"))).selectByVisibleText("test1");
  }

  public void addContactToSelectedGroup() {
    driver.findElement(By.name("add")).click();
  }

  public void goToGroupWithContactAddedPage() {
    driver.findElement(By.linkText("group page \"test1\"")).click();
  }

  public void initContactModification() {click(By.cssSelector("img[alt='Edit']"));

  }

  public void submitContactModification() {
    click(By.name("update"));
  }

  public void createContact(ContactData contact,boolean creation) {
    initContactCreation();
    fill_inNewContactForm(contact,true);
    submitContactCreation();
  }

  public boolean isThereAContact() {
    return (isElementPresent(By.name("selected[]")));
  }

  public void contactModification() {
    initContactModification();
    fill_inNewContactForm(new ContactData("Olga4", "Pro", "2064 Arbor Way Buford GA 30519", "5186189573", null), false);
    submitContactModification();
  }
}
