package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SelectCountry {

    public AppiumDriver driver;
    public WebDriverWait wait;


    String IcelandX = "//*[@text='Iceland']";
    String icelandClassName = "android.widget.RadioButton";
    String Done = "grit.storytel.app:id/buttonDone";

    public SelectCountry(AppiumDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void findIceland() throws InterruptedException {
        Thread.sleep(3000);
        TouchAction action = new TouchAction(driver);
        action.longPress(new PointOption().withCoordinates(536,1817)).moveTo(new PointOption().withCoordinates(500,700)).release().perform();
    }

    public void clickIceland(){

         driver.findElement(By.xpath(IcelandX)).click();
    }

    public void clickDone(){
        driver.findElement(By.id(Done)).click();
    }
}
