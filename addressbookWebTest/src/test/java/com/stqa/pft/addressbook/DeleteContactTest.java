package com.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class DeleteContactTest extends  TestBase {


  @Test
  public void testDeleteContact() throws Exception {

    app.selectContact();
    app.acceptNextAlert = true;
    app.deleteSelectedContact();
    app.assertTrueContactDelete();
    //driver.findElement(By.linkText("home")).click();
    //returnToGroupPage();
  }

}
