package com.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class DeleteContactTest extends  TestBase {


  @Test
  public void testDeleteContact() throws Exception {

    selectContact();
    acceptNextAlert = true;
    deleteSelectedContact();
    assertTrueContactDelete();
    //driver.findElement(By.linkText("home")).click();
    //returnToGroupPage();
  }

}
