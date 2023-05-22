package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletetionTests extends TestBase {

  @Test
  public void testContactDeletetion() {
    app.getNavigationHelper().goToHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().goToNewContactPage();
      app.getContactHelper().createContact(new ContactData("1", "2", "+7", "a@a.com", "Test11"));
      app.getNavigationHelper().goToHomePage();
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContactButton();
    app.getContactHelper().closeAlert();

  }
}