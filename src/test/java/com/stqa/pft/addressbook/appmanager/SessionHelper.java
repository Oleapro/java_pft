package com.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

  public SessionHelper(WebDriver driver) {
    super(driver);

  }

  public void login(String username, String password) {
    setFieldValue(By.name("user"), username);
    setFieldValue(By.name("pass"),password);
    click(By.xpath("//input[@value='Login']"));
  }
}
