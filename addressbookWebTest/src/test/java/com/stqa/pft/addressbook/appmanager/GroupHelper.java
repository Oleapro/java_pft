package com.stqa.pft.addressbook.appmanager;

import com.stqa.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{
  public GroupHelper(WebDriver driver) {
    super(driver);
  }


  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    setFieldValue(By.name("group_name"), groupData.name());
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

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));

  }

  public void createGroup(GroupData group) {
    initGroupCreation();
    fillGroupForm(group);
    submitGroupCreation();
    returnToGroupPage();
  }

  public int getGroupCount() {
    return driver.findElements(By.name("selected[]")).size();
  }
}
