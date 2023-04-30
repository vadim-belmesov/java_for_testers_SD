package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletetion() throws Exception {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroup();
    app.returnToGroupPage();
  }
}
