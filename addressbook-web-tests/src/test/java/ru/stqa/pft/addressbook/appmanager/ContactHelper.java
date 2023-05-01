package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver wd) {
        super(wd);
    }
    public void editContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("home"), contactData.getHomePhoneNumber());
        type(By.name("email"), contactData.getEmail());
    }

    public void submitContactModification() {
        //click(By.xpath("//img[@alt='Edit']"));
        click(By.name("update"));
    }

    public void deleteContactButton() {
        click(By.xpath("//input[@value='Delete']"));
    }
}
