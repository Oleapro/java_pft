package com.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(WebDriver driver) {
    super(driver);
  }

  public void login(String username, String password) {
    executeGroupAction(By.name("user"), username);
    executeGroupAction(By.name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
    }


}
