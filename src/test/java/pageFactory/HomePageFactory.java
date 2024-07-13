package pageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class HomePageFactory {

    private WebDriver driver;
    @FindBy(xpath = "//img[@alt='Institute Logo']")
    private WebElement logo;


    @FindBy(xpath = "//img[@title='Placement Drive']")
    private WebElement placement;


    @FindBy(xpath = "//img[@alt='Computer Science and Engineering (CSE)']")
    private WebElement cs;


    @FindBy(xpath = "//button[normalize-space()='Send Message']")
    private WebElement sms;
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='subject']")
    private WebElement subject;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement message;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    public HomePageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logoIsDisplayed() {
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Institute Logo']"));
        logo.isDisplayed();
    }

    public void mapIsDisplayed() {
        WebElement map = driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation3 css-3su884-MuiPaper-root']//div[@class='MuiBox-root css-h5fkc8']"));
        map.isDisplayed();
    }

    public void placementIsDisplayed() {
        placement.isDisplayed();
    }


    public void csIsDisplayed() {
        cs.isDisplayed();
    }

    public void smsIsDisplayed() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        firstName.sendKeys("Nirmal");
        lastName.sendKeys("Raj");
        email.sendKeys("nirmal@gmail.com");
        subject.sendKeys("Feedback");
        message.sendKeys("Very Nice Institute");
        js.executeScript("arguments[0].scrollIntoView(true);", sms);
        Thread.sleep(1000);
        sms.click();

        Alert alert = driver.switchTo().alert();

        Thread.sleep(2000);

        String alertMessage = alert.getText();


        Assert.assertEquals(alertMessage, "Thank you our esteemed member, your message has been recorded");

        alert.accept();

    }


}
