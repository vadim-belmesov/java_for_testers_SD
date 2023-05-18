package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void editContact() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void fillContactForm(ContactData contact, boolean creation) {
    type(By.name("firstname"), contact.getFirstname());
    type(By.name("lastname"), contact.getLastname());
    type(By.name("home"), contact.getHomePhoneNumber());
    type(By.name("email"), contact.getEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contact.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void submitContactModification() {
    click(By.name("update"));
  }

  public void deleteContactButton() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public boolean isThereAContact() { //дописать!
    return isElementPresent(By.name("selected[]"));
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void createContact(ContactData contact, boolean b) {
    fillContactForm(contact, b);
    submitContactCreation();
  }
}
