package com.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
 WebDriver driver;

  public SessionHelper sessionHelper;
  public GroupHelper groupHelper;
  public NavigationHelper navigationHelper;
  public ContactHelper contactHelper;

  public StringBuffer verificationErrors = new StringBuffer();
  private String browser;

  public ApplicationManager(String browser){
    this.browser = browser;
  }

  public void init() {
    if (browser == BrowserType.FIREFOX){
      driver = new FirefoxDriver();
    } else if (browser == BrowserType.CHROME) {
      driver = new ChromeDriver();
    } else if ( browser == BrowserType.EDGE) {
      driver = new EdgeDriver();
      
    }

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
