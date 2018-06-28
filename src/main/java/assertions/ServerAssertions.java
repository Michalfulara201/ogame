package assertions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServerAssertions extends LoginAssertion {

    @FindBy(xpath = "//span[text()='Podgląd']")
    private WebElement isLoggedToAccountPage;

    public ServerAssertions(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void isLoggedToAccountPage(){

        Assert.assertTrue(isLoggedToAccountPage.isDisplayed());


    }





}
