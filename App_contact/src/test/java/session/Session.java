package session;

import controlAppium.Label;
import factoryDevices.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.time.Duration;

public class Session {

    private static Session instance=null;
    private AppiumDriver driver;

   private Session() throws MalformedURLException {
        driver= FactoryDevice.make(FactoryDevice.DeviceType.ANDROID).create();
    }

    public static Session getInstance() throws MalformedURLException {
        if (instance == null)
            instance= new Session();
        return instance;
    }

    public void closeSession(){
        driver.quit();
        instance=null;
    }

    public AppiumDriver getDriver() {
        return driver;
    }

    public void swipe() throws MalformedURLException {

        Label startControl = new Label(By.xpath("//android.widget.ListView/android.view.ViewGroup[4]"));
        Label endControl = new Label(By.xpath("//android.widget.ListView/android.view.ViewGroup[1]"));

        int startControlX=startControl.getControl().getLocation().getX();
        int startControlY=startControl.getControl().getLocation().getY();

        int endControlX=endControl.getControl().getLocation().getX();
        int endControlY=endControl.getControl().getLocation().getY();

        TouchAction action = new TouchAction(driver);

        action.press(PointOption.point(startControlX,startControlY)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                moveTo(PointOption.point(endControlX,endControlY)).
                release().perform();
    }

}
