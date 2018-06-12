package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends MainPage {
    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


}
