package com.stqa.pft.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class CreateNewContactTest {
  public WebDriver driver;
  //private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();



  @BeforeClass
  public void setWebDriver() {
    System.setProperty("webdriver.gecko.driver", "c:\\WebDrivers\\geckodriver.exe");
  }


    @BeforeMethod
    public void setUp() throws Exception {
    driver = new FirefoxDriver();
    //baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://localhost/addressbook/");
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys("admin");
      driver.findElement(By.name("pass")).click();
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys("secret");
      driver.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testCreateNewContact() throws Exception {
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys("Olga");
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys("Pro");
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys("2064 Arbor Springs Way\nBuford GA 30519");
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys("5186189573");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("home")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
