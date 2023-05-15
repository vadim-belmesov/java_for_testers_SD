package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupsCreatingTests extends TestBase {

  @Test
  public void testGroupsCreating() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("Test11", "Test12", "Test13"));
  }
}
