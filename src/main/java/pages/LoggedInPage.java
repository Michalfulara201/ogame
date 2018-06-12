package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoggedInPage extends MainPage {

    public MenuPage menu;


    public LoggedInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.menu = menu;
    }
}
