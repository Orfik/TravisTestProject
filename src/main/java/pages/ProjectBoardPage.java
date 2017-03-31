package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;


public class ProjectBoardPage extends BasePage {

    @FindBy(xpath = ".//span[@class='userName']")
    private WebElement userName;
    @FindBy(xpath = "//a[@href = '#choosedesign_popup']")
    private WebElement linkNewProject;
    @FindBy(xpath = ".//*[@id='apps-list']/div[2]")
    private WebElement firstProject;
    @FindBy(xpath = "//div[69]/div/ul/li[4]/a")
    private WebElement deleteButton;
    @FindBy (xpath = "//*[@id='apps-list']/div[16]/div/ul/li[4]/div/div/a[1]")
    private WebElement confirmDeletionBtn;
    private static final String DEFAULTPROJECTNAME = "//span[@title = 'Untitled']";


    public ProjectBoardPage(WebDriver driver) {
        super(driver);
    }

    public String getUserName() {
        return userName.getText();
    }

    @Step
    public DetailProjectPage createNewProject() {
        linkNewProject.click();
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(DEFAULTPROJECTNAME)));
        return new DetailProjectPage(driver);
    }
    @Step
    public DetailProjectPage openProject() {
        firstProject.click();
        fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.className("crumbs")));
        return new DetailProjectPage(driver);
    }
    @Step
    public DetailProjectPage deleteProject(){
        deleteButton.click();
        confirmDeletionBtn.click();
        return new DetailProjectPage(driver);
        }
}
