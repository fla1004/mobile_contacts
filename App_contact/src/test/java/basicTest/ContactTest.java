package basicTest;

import activities.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class ContactTest {

    private MainPage mainPage = new MainPage();
    private InfoContactPage infoContactPage = new InfoContactPage();
    private CreatedContactPage createdContactPage = new CreatedContactPage();

    private String contactName = "Angel";
    private String contactPhone = "70738098";
    @BeforeEach
    public void confirmationAlert() throws MalformedURLException {
        mainPage.confirmationAlert.click();
        mainPage.confirmationAlert.click();
    }

    @Test
    public void createContact() throws MalformedURLException {

        mainPage.addContact.click();
        infoContactPage.firstNameTextBox.setValue(contactName);
        infoContactPage.phoneTextBox.setValue(contactPhone);
        infoContactPage.addContact.click();

        Assertions.assertEquals(contactName ,createdContactPage.nameTaskLabel.getText(),"ERROR! the contact was not created");
    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }


    public void newUser() throws MalformedURLException {

        mainPage.addContact.click();
        infoContactPage.firstNameTextBox.setValue(contactName);
        infoContactPage.phoneTextBox.setValue("70738098");
        infoContactPage.addContact.click();
        createdContactPage.returnToList.click();

    }


}
