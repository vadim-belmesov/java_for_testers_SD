package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreatingTests extends TestBase{

  @Test
  public void testCreateContact() {
    app.getNavigationHelper().goToNewContactPage();
    app.getContactHelper().fillContactForm(new ContactData("1","2","+7","a@a.com","Test11"), true);
    app.logout();
  }
}
