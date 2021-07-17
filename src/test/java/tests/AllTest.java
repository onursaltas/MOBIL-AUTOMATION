package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BookPage;
import pages.SelectCountry;
import pages.LandingPage;
import pages.SelectLanguage;

public class AllTest extends BaseClass{

    public LandingPage landingPage;
    public SelectCountry selectCountry;
    public SelectLanguage languageSelectionPage;
    public BookPage bookPage;


    @BeforeMethod
    public void initialize(){

        landingPage = new LandingPage(driver, (WebDriverWait) wait);
        selectCountry = new SelectCountry(driver, (WebDriverWait) wait);
        languageSelectionPage = new SelectLanguage(driver, (WebDriverWait) wait);
        bookPage = new BookPage(driver, (WebDriverWait) wait);

    }

    @Test(priority = 0)
    public void tryIt(){
        landingPage.clickTry();
    }

    @Test(priority = 1)
    public void findAndClickIceland() throws InterruptedException {
            selectCountry.findIceland();
            selectCountry.clickIceland();
            selectCountry.clickDone();

    }

    @Test(priority = 2)
    public void selectOnlyEnglish(){
        languageSelectionPage.deselectIcelandic();
        languageSelectionPage.clickDone();
    }

    @Test(priority = 3)
    public void selectBookFromFeelGoodSection() throws InterruptedException {

        bookPage.FindFeelGood();
        bookPage.SelectBook();

    }



}
