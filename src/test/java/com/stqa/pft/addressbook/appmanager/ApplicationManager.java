package com.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.testng.Assert.fail;

public class ApplicationManager {
  WebDriver driver;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;
  private SessionHelper sessionHelper;

  public StringBuffer verificationErrors = new StringBuffer();

  public void init() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(driver);
    contactHelper = new ContactHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
