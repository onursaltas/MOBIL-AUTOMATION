package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SelectLanguage {

    public AppiumDriver driver;
    public WebDriverWait wait;

    String languagesClassnames = "android.widget.CheckBox";
    String doneButtonId = "grit.storytel.app:id/buttonDone";

    public SelectLanguage(AppiumDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;

    }

    public void deselectIcelandic(){
        List<MobileElement> elementList = driver.findElements(By.className(languagesClassnames));
        elementList.get(0).click();
    }

    public void clickDone(){
        driver.findElement(By.id(doneButtonId)).click();
    }

}
