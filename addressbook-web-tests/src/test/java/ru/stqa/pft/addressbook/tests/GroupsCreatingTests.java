package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupsCreatingTests extends TestBase {

  @Test
  public void testGroupsCreating() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("Test11", "Test12", "Test13"));
    app.submitGroupCreation();
    app.returnToGroupPage();
    app.logout();
  }
}
