package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletetionTests extends TestBase{


    @Test
    public void testContactDeletetion(){
        app.getNavigationHelper().goToHomePage();
        app.getGroupHelper().selectGroup();
        app.getContactHelper().deleteContactButton();
        app.getContactHelper().closeAlert();

    }
}
