package com.stqa.pft.addressbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeClass
  public void setWebDriver() {
    System.setProperty("webdriver.gecko.driver", "c:\\WebDrivers\\geckodriver.exe");
  }

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();//(driver,wait,url.login)
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();
  }

}
