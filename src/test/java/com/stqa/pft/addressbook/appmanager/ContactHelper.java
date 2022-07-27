package com.stqa.pft.addressbook.appmanager;

import com.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper  extends HelperBase{


  public ContactHelper(WebDriver driver){
    super(driver);

  }


  public void deleteSelectedContact() {
    driver.findElement(By.cssSelector("input[value='Delete']")).click();
  }

  public void selectContact() {
    driver.findElement(By.name("selected[]")).click();
  }

  public void submitContactCreation() {
    driver.findElement(By.name("submit")).click();
  }

  public void fillContactForm(ContactData contactData) {
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys(contactData.firstName());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys(contactData.lastName());
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys(contactData.mobile());
  }

  public void initContactCreation() {
    driver.findElement(By.linkText("add new")).click();
  }
}
