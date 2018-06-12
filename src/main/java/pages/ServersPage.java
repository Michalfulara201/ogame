package pages;

import assertions.LoginAssertion;
import assertions.RegisterAssertions;
import org.openqa.selenium.WebDriver;

public  class ServersPage extends MainPage {


    public RegisterAssertions registerAssertions;
    public LoginAssertion loginAssertion;

    public ServersPage(WebDriver driver) {
        super(driver);
        registerAssertions = new RegisterAssertions(driver);
        loginAssertion = new LoginAssertion(driver);

    }
}