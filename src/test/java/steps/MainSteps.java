package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.IndexPage;

@CucumberOptions(features = "src/test/resources/gherkin/", glue ="steps")

public class MainSteps extends AbstractTestNGCucumberTests {


    protected static WebDriver driver;
    protected static IndexPage indexPage;


    @BeforeTest
    public void before(){

        driver = new ChromeDriver();
        indexPage = new IndexPage(driver, "https://pl.ogame.gameforge.com/");
    }


    @AfterTest
    public void after(){
        driver.close();
    }
}
