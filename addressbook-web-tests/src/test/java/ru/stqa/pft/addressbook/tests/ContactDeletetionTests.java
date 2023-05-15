package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletetionTests extends TestBase{

    @Test
    public void testContactDeletetion(){
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContactButton();
        app.getContactHelper().closeAlert();

    }
}
