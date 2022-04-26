package com.stqa.pft.addressbook.tests;

import com.stqa.pft.addressbook.appmanager.ApplicationManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();
  private WebDriver driver;

  @BeforeClass()
  public void setUpClass() {
    app.setWebDriver();
  }

  @BeforeMethod()
  public void setUp() {
    app.init();
  }

  @AfterMethod(alwaysRun = true)
  protected void tearDown() {
    app.stop();
  }


}
