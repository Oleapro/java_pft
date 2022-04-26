package com.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {


  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void go_toGroupPage() {

    click(By.linkText("groups"));
  }
public  void go_toContactsHomePage() {
  driver.findElement(By.linkText("home")).click();
}
}
