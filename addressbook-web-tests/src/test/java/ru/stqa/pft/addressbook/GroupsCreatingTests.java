package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupsCreatingTests extends TestBase {

  @Test
  public void testGroupsCreating() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Test11", "Test12", "Test13"));
    submitGroupCreation();
    returnToGroupPage();
    logout();
  }
}
