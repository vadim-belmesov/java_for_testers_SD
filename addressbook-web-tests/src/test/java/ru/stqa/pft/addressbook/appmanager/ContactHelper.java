package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
      type(By.name("firstname"),contactData.getFirstname());
      click(By.name("theform"));
      click(By.name("lastname"));
      type(By.name("lastname"), contactData.getLastname());
      click(By.name("home"));
      type(By.name("home"),contactData.getHomePhoneNumber());
      click(By.name("email"));
      type(By.name("email"),contactData.getEmail());
      click(By.name("theform"));
      click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void goToNewContactPage() {
      wd.findElement(By.linkText("add new")).click();
    }

    public void fillContacrForm() {
      fillContactForm(new ContactData("user2", "lastname2", "+79994442289", "email.user@mail.com"));
    }
}
