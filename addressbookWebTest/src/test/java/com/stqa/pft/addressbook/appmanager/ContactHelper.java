package com.stqa.pft.addressbook.appmanager;

import com.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase{

  public boolean acceptNextAlert = true;

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void fill_inNewContactForm(ContactData contactData) {
    setFieldValue(By.name("firstname"), contactData.firstName());
    setFieldValue(By.name("lastname"), contactData.lastName());
    setFieldValue(By.name("address"), contactData.address());
    setFieldValue(By.name("mobile"), contactData.phoneNumber());
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
    new Select(driver.findElement(By.name("to_group"))).selectByVisibleText("NewGroupTest");
  }
  public void addContactToSelectedGroup() {
    driver.findElement(By.name("add")).click();
  }
  public void goToGroupWithContactAdedPage() {
    driver.findElement(By.linkText("group page \"NewGroupTest\"")).click();
  }
}
