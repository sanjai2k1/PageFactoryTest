package pageFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StudentPageFactory {
    @FindBy(xpath = "//h3[normalize-space()='Dear Student Welcomeback']")
    private WebElement studentHeader;
    @FindBy(xpath = "//span[normalize-space()='Students Database']")
    private WebElement studenDatabaseButton;
    @FindBy(xpath = "//a[@class='btn btn-outline-success']")
    private WebElement addButton;
    @FindBy(xpath = "//input[@name='RollNo']")
    private WebElement rollNoField;

    @FindBy(xpath = "//input[@name='Name']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@name='Dept']")
    private WebElement deptField;

    @FindBy(xpath = "//input[@name='Contact']")
    private WebElement contactField;

    @FindBy(xpath = "//input[@name='Email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='Gender']")
    private WebElement genderField;

    @FindBy(xpath = "//input[@name='DOB']")
    private WebElement dobField;

    @FindBy(xpath = "//input[@name='Address']")
    private WebElement addressField;

    @FindBy(xpath = "//input[@name='Password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[normalize-space()='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//div[@class='text-center p-4 footer']")
    private WebElement footer;
    @FindBy(xpath = "//tbody/tr[19]/td[11]/a[1]")
    private WebElement studentEdit;

    @FindBy(xpath = "//tbody/tr[19]/td[11]/button[1]")
    private WebElement studentDelete;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement logOutButton;

    private WebDriver driver;
    public StudentPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void userIsOnStudentHomePage() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertFalse(driver.findElements(By.xpath("//h3[normalize-space()='Dear Student Welcomeback']")).isEmpty(), "user is navigated to Student Home page");

    }
       public void clickOnStudentDatabase() throws InterruptedException {
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", studenDatabaseButton);
            System.out.println("User is clicking on student database button");
            Thread.sleep(1000);
            studenDatabaseButton.click();
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", studentHeader);
    }

    public void clickOnAddButton() throws InterruptedException {
        Thread.sleep(2000);

addButton.click();
    }


    public void enterDetails(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {

        rollNoField.sendKeys(string);
        nameField.sendKeys(string2);
        deptField.sendKeys(string3);
        contactField.sendKeys(string4);
        emailField.sendKeys(string5);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", genderField);
        Thread.sleep(1000);
        genderField.sendKeys(string6);
        dobField.sendKeys(string7);
        addressField.sendKeys(string8);
        passwordField.sendKeys(string9);



    }
    public void clickSubmitButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        Thread.sleep(2000);

        submitButton.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
    }

    public void clickEditButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", footer);
        Thread.sleep(1000);
        studentEdit.click();
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        Thread.sleep(1000);
        submitButton.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();


    }

    public void clickDeleteButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", footer);
        Thread.sleep(1000);
        studentDelete.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(1000);
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.accept();


    }
    public void clickLogOut() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", studentHeader);
        Thread.sleep(1000);
logOutButton.click();

Alert alert2 = driver.switchTo().alert();

        Thread.sleep(2000);

        alert2.accept();
    }
}
