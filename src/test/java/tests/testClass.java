package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class testClass {
    protected WebDriver driver;

    @Test
    public void testGoogleSearch() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir") + "//src//test/resources//geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
}