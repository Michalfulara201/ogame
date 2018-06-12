package assertions;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class RegisterAssertions extends MainPage {


    @FindBy(xpath = "//div[@class='formErrorContent']")
    private WebElement userRegistered;

    public RegisterAssertions(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, driver);
    }

    public void isUserRegistered() {

        Assert.assertTrue(userRegistered.isDisplayed());

    }

}
