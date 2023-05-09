package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().editContact();
    //final ContactData contactData = new ContactData("1", "2", "+7", "a@a");
    app.getContactHelper().fillContactForm(new ContactData("1888", "2888", "+788", "a@a888", null));
    app.getContactHelper().submitContactModification();
  }
}
