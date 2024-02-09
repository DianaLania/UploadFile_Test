package Pages;
import org.openqa.selenium.By;

import static Tests.SeleniumTest.driver;


public class FileUploadPage {
    public static String choose_button_xpath = "/html/body/div/form/div/div/span[1]/button";


    public static String chooseButton_verifyClick() {
        driver.findElement(By.xpath(choose_button_xpath)).click();
        return null;
    }

    public static String uploadFile_verify() {
        driver.findElement(By.xpath(choose_button_xpath)).sendKeys("C:\\Users\\Zuzia\\IdeaProjects\\UploadFile\\src\\test\\resources\\test.txt");
        return null;
    }
}
