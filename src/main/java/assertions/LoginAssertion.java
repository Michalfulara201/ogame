package assertions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class LoginAssertion extends MainPage {

    @FindBy(xpath ="//div/h2/span[text()='Zacznij w nowym uniwersum']" )
    private WebElement menuButton;
    @FindBy(xpath = "//div[@class='usernameLoginformError parentFormloginForm formError']")
    private WebElement passwordErrorVisible;
    @FindBy(xpath = "//div[@class='formErrorContent']")
    private WebElement loginErrorVisible;

    public LoginAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void isUserLoggedIn(){
        waitForElement();
        Assert.assertTrue(menuButton.isDisplayed());
    }

    public void userNotLoggedwithWrongPassword(){
        Assert.assertTrue(passwordErrorVisible.isDisplayed());
    }
    public void userNotLoggedwithWrongLoggin(){
        Assert.assertTrue(loginErrorVisible.isDisplayed());
    }
}
