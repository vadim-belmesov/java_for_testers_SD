package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDeletetion() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroup();
    returnToGroupPage();
  }
}
