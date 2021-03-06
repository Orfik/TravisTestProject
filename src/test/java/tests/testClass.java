package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;



public class testClass {
    protected WebDriver driver;

    @Test
    public void testGoogleSearch() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir") + "//src//test/resources//geckodriver_v.14");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        //driver = new RemoteWebDriver(capabilities);
        driver = new FirefoxDriver(capabilities);
        driver.get("https://stage.storied.co");
        Thread.sleep(3000);  // Let the user actually see something!
        WebElement email = driver.findElement(By.id("login"));
        email.sendKeys("qa@storied.co");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("zxc123");
        WebElement button = driver.findElement(By.xpath(".//button[text()='Sign in']"));
        button.click();
        Thread.sleep(3000);
        WebElement studioHome = driver.findElement(By.cssSelector("a.menu_page_item:nth-child(2)"));
        studioHome.click();
        Thread.sleep(3000);
        ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='current_account_id_chosen']/a/span"))); // Let the user actually see something!
        driver.quit();
        System.out.print("Work");
    }
}