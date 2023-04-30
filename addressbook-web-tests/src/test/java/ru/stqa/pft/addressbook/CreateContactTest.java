package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class CreateContactTest extends TestBase{

  @Test
  public void testCreateContact() throws Exception {
    goToNewContactPage();
    fillContacrForm();
    logout();
  }
}
