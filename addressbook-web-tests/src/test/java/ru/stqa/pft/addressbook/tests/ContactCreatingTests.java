package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactCreatingTests extends TestBase{

  @Test
  public void testCreateContact() {
    app.getNavigationHelper().goToNewContactPage();
    app.getContactHelper().createContact(new ContactData("1","2","+7","a@a.com","Test1"));
  }
}
