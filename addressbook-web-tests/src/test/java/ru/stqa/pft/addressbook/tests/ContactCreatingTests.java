package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactCreatingTests extends TestBase{

  @Test
  public void testCreateContact() {
    app.getNavigationHelper().goToNewContactPage();
    int before = app.getContactHelper().getContactsCount();
    if (! app.getGroupHelper().isAGroupPresent()){
      app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
    }
    app.getContactHelper().createContact(new ContactData("1","2","+7","a@a.com","Test1"));
    int after = app.getContactHelper().getContactsCount();
    Assert.assertEquals(after, before + 1);
  }
}
