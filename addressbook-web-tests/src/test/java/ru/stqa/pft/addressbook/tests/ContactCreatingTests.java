package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class ContactCreatingTests extends TestBase{

  @Test
  public void testCreateContact() throws Exception {
    app.goToNewContactPage();
    app.fillContacrForm();
    app.logout();
  }
}
