package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageFactory {

	@FindBy(xpath = "//a[normalize-space()='Login']")
	private WebElement login;
	@FindBy(xpath = "//img[@alt='Institute Logo']")
	private WebElement logo;
	@FindBy(xpath = "//input[@id=':r1:']")
	private WebElement nameElement;
	@FindBy(xpath = "//input[@id=':r3:']")
	private WebElement passwordElement;
	@FindBy(xpath = "//div[@id=':r5:']")
	private WebElement usertypeElement;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement loginButton;
	WebDriver driver;
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void clickLoginButton() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", login);
		System.out.println("User is clicking on log in button");

		Thread.sleep(2000);
		login.click();

	}
	public void userIsOnLoginPage(){
        Assert.assertTrue(logo.isDisplayed());

	}
	public void enterDetails(String username, String password, String usertype) throws InterruptedException {
		Thread.sleep(1000);

		nameElement.sendKeys(username);
		Thread.sleep(1000);

		passwordElement.sendKeys(password);
		Thread.sleep(1000);

		usertypeElement.click();
		Thread.sleep(1000);

		String clicking = "//li[normalize-space()='"+usertype+"']";
		driver.findElement(By.xpath(clicking)).click();
		Thread.sleep(2000);
	}
	public void clickLogin(){

		loginButton.click();
	}
}
