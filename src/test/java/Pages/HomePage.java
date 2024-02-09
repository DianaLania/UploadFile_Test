package Pages;

import org.openqa.selenium.By;

import static Tests.SeleniumTest.driver;

public class HomePage {
    public static String fileUpload_xpath = "/html/body/div/div/li[8]/a";

    public static void FileUpload_click() {
        driver.findElement(By.xpath(fileUpload_xpath)).click();
    }
}
