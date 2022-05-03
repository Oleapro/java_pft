package com.stqa.pft.addressbook.appmanager;

import com.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper {
  public WebDriver driver;

  public boolean acceptNextAlert = true;

  public ContactHelper(WebDriver driver) {

    this.driver = driver;
  }

  public void initContactCreation() {
    driver.findElement(By.linkText("add new")).click();
  }

  public void fill_inNewContactForm(ContactData contactData) {
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys(contactData.firstName());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys(contactData.lastName());
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys(contactData.address());
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys(contactData.phoneNumber());
  }

  public void submitContactCreation() {
    driver.findElement(By.name("submit")).click();
  }

  public void selectContact() {
    driver.findElement(By.name("selected[]")).click();
  }

  public void deleteSelectedContact() {
    driver.findElement(By.xpath("//input[@value='Delete']")).click();
  }


}
