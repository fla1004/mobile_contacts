package activities;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class CreatedContactPage {
    public Label nameTaskLabel = new Label(By.id("com.google.android.contacts:id/large_title"));
    public Button returnToList = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
    public Button editContact = new Button(By.id("com.google.android.contacts:id/floating_action_button"));

}
