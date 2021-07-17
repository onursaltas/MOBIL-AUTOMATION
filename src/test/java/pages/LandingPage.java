package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

public AppiumDriver driver;
public WebDriverWait wait;

String TryIn = "grit.storytel.app:id/create_account_preview";

public LandingPage(AppiumDriver driver, WebDriverWait wait){
this.driver = driver;
this.wait = wait;
}

public void clickTry(){
    driver.findElement(By.id(TryIn)).click();
}





}
