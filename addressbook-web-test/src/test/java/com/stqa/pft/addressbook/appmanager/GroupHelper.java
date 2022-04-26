package com.stqa.pft.addressbook.appmanager;

import com.stqa.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{

  public GroupHelper(WebDriver driver) {
    super(driver);

  }

  public void return_toGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));

  }

  public void fillGroupForm(GroupData groupData) {
    executeGroupAction(By.name("group_name"), groupData.name());
    executeGroupAction(By.name("group_header"), groupData.header());
    executeGroupAction(By.name("group_footer"), groupData.footer());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

}
