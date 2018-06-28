package pages;

import assertions.ServerAssertions;
import org.openqa.selenium.WebDriver;

public class AccountPage extends ServersPage {

    public ServerAssertions serverAssertions;



    public AccountPage(WebDriver driver) {
        super(driver);
        serverAssertions = new ServerAssertions(driver);

    }
}
