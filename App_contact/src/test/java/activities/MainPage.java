package activities;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class MainPage {

    public Button confirmationAlert = new Button(By.id("com.android.packageinstaller:id/permission_allow_button"));
    public Button addContact = new Button(By.id("com.google.android.contacts:id/floating_action_button"));

    public Button moreOptionsMain = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
    public Button selectOptionOneMain = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
    public Button addToLabel = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
    public Button selectLabel = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[1]"));

    public MainPage(){}

    public Button getName(String name) throws MalformedURLException {

       Button search = new Button(By.xpath("//android.widget.TextView[@content-desc='"+name+"']"));

       return  search;
    }
}
