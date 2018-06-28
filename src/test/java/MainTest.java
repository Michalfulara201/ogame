import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import pages.IndexPage;

import java.io.File;
import java.io.IOException;

public abstract class MainTest {
    protected WebDriver driver;
    protected IndexPage indexPage;


    @BeforeMethod
    @Parameters({"url"})
    public void before(String url) {
        driver = new ChromeDriver();
        indexPage = new IndexPage(driver,url);



    }
    @AfterMethod
    public void after(ITestResult result){
        if (result.getStatus()==ITestResult.FAILURE){
            try{
                String reportDictionary = new File(System.getProperty("user.dir")).getAbsolutePath() + "\\test-output";
                String screenshotPath = reportDictionary + "errorScreenshots\\" + result.getName() + ".jpg";
                //File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                //FileUtils.copyFile(scrFile, new File(screenshotPath));
                byte[] scrByte=((TakesScreenshot)driver).getScreenshotAs((OutputType.BYTES));
                Allure.getLifecycle().addAttachment(screenshotPath,"image/jpg",".jpg",scrByte);
                Reporter.log("<a href='"+ screenshotPath + "'> <img src='" +screenshotPath + "'height='100' width='100'/></a>");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        driver.quit();

    }

   }

