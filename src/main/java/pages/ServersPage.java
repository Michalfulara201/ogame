package pages;

import assertions.LoginAssertion;
import assertions.RegisterAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.seleniumhq.jetty9.server.Server;

import java.util.Set;

public class ServersPage extends MainPage {


    public RegisterAssertions registerAssertions;
    public LoginAssertion loginAssertion;

    @FindBy(xpath = "//button/span[text()='Graj']")
    private WebElement selectServer;

    public ServersPage(WebDriver driver) {
        super(driver);
        registerAssertions = new RegisterAssertions(driver);
        loginAssertion = new LoginAssertion(driver);

    }

    public AccountPage chooseServerfromList() {
        waitForElement();
        selectServer.click();


        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);


        }
        waitForPageLoad();
        driver.switchTo().defaultContent();

        return new AccountPage(driver);


    }
}