package Tests;

import Pages.FileUploadPage;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



public class SeleniumTest {

    public static WebDriver driver;
    static ExtentReports report;
    public static ExtentTest test;
    static ExtentReports extent = new ExtentReports();

    public static ChromeOptions options;

    @BeforeSuite
    public static void Setup() {
        options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://formy-project.herokuapp.com/");
        Reporter.log("The browser is opened.");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    void OpenSelectWindow_Test() {
        HomePage.FileUpload_click();
        Reporter.log("File upload button is clicked.");
        FileUploadPage.chooseButton_verifyClick();
        Reporter.log("File is chosen.");
    }

    @Test
    void UploadFile_Test() {
        FileUploadPage.uploadFile_verify();
        Reporter.log("File is uploaded to the website.");
        driver.close();
        Reporter.log("The browser is closed.");
    }
}
