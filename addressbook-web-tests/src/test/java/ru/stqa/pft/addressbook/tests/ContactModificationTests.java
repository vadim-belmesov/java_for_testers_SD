package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToHomePage();
    if (! app.getContactHelper().isThereAContact()){
      app.getNavigationHelper().goToNewContactPage();
      app.getContactHelper().createContact(new ContactData("1","2","+7","a@a.com","Test11"), true);
      app.getNavigationHelper().goToHomePage();
    }
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("1888", "2888", "+788", "a@a.com", "Test11"), false);
    app.getContactHelper().submitContactModification();
  }
}
