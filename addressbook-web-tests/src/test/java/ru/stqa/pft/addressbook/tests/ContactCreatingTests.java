package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreatingTests extends TestBase{

  @Test
  public void testCreateContact() throws Exception {
    app.getNavigationHelper().goToNewContactPage();
    app.getContactHelper().fillContactForm(new ContactData("1","2","+7","a@a","Test1"));
    app.logout();
  }
}
