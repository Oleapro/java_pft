package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

//  @BeforeClass
//  public void setWebDriver() {
//    System.setProperty("webdriver.gecko.driver", "c:\\WebDrivers\\geckodriver.exe");
//  }

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();//(driver,wait,url.login)
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();
  }

}
