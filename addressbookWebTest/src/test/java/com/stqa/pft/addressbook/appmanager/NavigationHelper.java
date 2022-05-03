package com.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
  public WebDriver driver;
  public NavigationHelper(WebDriver driver) {
    this.driver = driver;

  }


  public void go_toGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  public void returnToHomePage() {
    driver.findElement(By.linkText("home")).click();
  }
}
