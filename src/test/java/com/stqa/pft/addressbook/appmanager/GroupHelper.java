package com.stqa.pft.addressbook.appmanager;

import com.stqa.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{

  public GroupHelper(WebDriver driver) {
    super(driver);
  }



  public void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  public void submitGroutCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    setFieldValue(By.name("group_name"), groupData.groupName());
    setFieldValue(By.name("group_header"), groupData.header());
    setFieldValue(By.name("group_footer"), groupData.footer());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }


  public void deleteSelectedGroup() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }


  public void createGroup() {
    initGroupCreation();
    fillGroupForm(new GroupData("NewGroup", "teest1", "test2"));
    submitGroutCreation();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));

  }
}
