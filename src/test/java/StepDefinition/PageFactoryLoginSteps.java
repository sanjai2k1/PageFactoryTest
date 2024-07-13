package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.*;

public class PageFactoryLoginSteps {

	private static WebDriver driver;

	HomePageFactory home;
	LoginPageFactory login;
	StudentPageFactory student;

	TrainerPageFactory trainer;
	AdminPageFactory admin;
	@Given("User is on Home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is trying to log in");
		driver=new FirefoxDriver();
		driver.manage().window().maximize(); // Set the browser to full screen mode
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://localhost:3000/");
	    home=new HomePageFactory(driver);
	    home.logoIsDisplayed();
	}

	@When("User clicks on AboutUs button")
	public void user_clicks_on_about_us_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[normalize-space()='About Us']")).click();
		home=new HomePageFactory(driver);
	    home.mapIsDisplayed();
	}

	@When("User clicks on Placements button")
	public void user_clicks_on_placements_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//a[normalize-space()='Placements']")).click();
			home=new HomePageFactory(driver);
		    home.placementIsDisplayed();
	}

	@When("User clicks on Departments button")
	public void user_clicks_on_departments_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//a[normalize-space()='Departments']")).click();
			home=new HomePageFactory(driver);
		    home.csIsDisplayed();
	}

	@When("User clicks on ContactUs button")
	public void user_clicks_on_contact_us_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click();
			home=new HomePageFactory(driver);
		    home.smsIsDisplayed();
	}
	
	








@Given("User is on the home page")
public void user_is_on_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
	 	driver.get("http://localhost:3000/");
	    home=new HomePageFactory(driver);
	    home.logoIsDisplayed();
}

@And("clicks on navigate login button")
public void clicks_on_navigate_login_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	login = new LoginPageFactory(driver);
	login.clickLoginButton();
}

@Then("user is navigated to the login page")
public void user_is_navigated_to_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	login=new LoginPageFactory(driver);
	login.userIsOnLoginPage();
	
}




@When("User enters valid {string} and {string} and {string}")
public void user_enters_valid_and_and(String username, String password, String usertype) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	login=new LoginPageFactory(driver);
	login.enterDetails(username,password,usertype);
	
}

@Then("clicks on login button")
public void clicks_on_login_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	login=new LoginPageFactory(driver);
	login.clickLogin();
	}















@Given("User is on the Student home page")
public void user_is_on_the_student_home_page() throws InterruptedException {
	student = new StudentPageFactory(driver);
	student.userIsOnStudentHomePage();

}

@Given("clicks on navigate Student Database button")
public void clicks_on_navigate_student_database_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	student = new StudentPageFactory(driver);
	student.clickOnStudentDatabase();
	
}

@Then("clicks on Add student button")
public void clicks_on_add_student_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions

	student = new StudentPageFactory(driver);
	student.clickOnAddButton();
}

@When("students enters valid {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
public void students_enters_valid_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {
	student = new StudentPageFactory(driver);
	student.enterDetails(string, string2, string3, string4, string5, string6, string7, string8,string9);
	Thread.sleep(1000);
	student.clickSubmitButton();

}

@Then("clicks on edit button")
public void clicks_on_edit_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	student = new StudentPageFactory(driver);
	student.clickEditButton();
}



@Then("clicks on delete button")
public void clicks_on_delete_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	student = new StudentPageFactory(driver);
	student.clickDeleteButton();


}


@Then("clicks on logout button")
public void clicks_on_logout_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	student = new StudentPageFactory(driver);
	student.clickLogOut();

}









@Given("User is on the Trainer home page")
public void user_is_on_the_trainer_home_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	trainer = new TrainerPageFactory(driver);
	trainer.userIsOnTrainerHomePage();
}

	@Given("Trainer clicks on navigate Student Database button")
	public void trainer_clicks_on_navigate_student_database_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		trainer = new TrainerPageFactory(driver);
		trainer.clickOnStudentDatabase();

	}

	@Then("Trainer clicks on Add student button")
	public void trainer_clicks_on_add_student_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		trainer = new TrainerPageFactory(driver);
		trainer.clickOnAddButton();
	}

	@When("Trainer enters valid {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void trainer_enters_valid_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {
		trainer = new TrainerPageFactory(driver);

		trainer.enterDetails(string, string2, string3, string4, string5, string6, string7, string8,string9);
		Thread.sleep(1000);
		trainer.clickSubmitButton();

	}

	@Then("Trainer clicks on edit button")
	public void trainer_clicks_on_edit_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		trainer = new TrainerPageFactory(driver);
		trainer.clickEditButton();
	}



	@Then("Trainer clicks on delete button")
	public void trainer_clicks_on_delete_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		trainer = new TrainerPageFactory(driver);
		trainer.clickDeleteButton();


	}



	@Then("Trainer Clicks on courses database button")
public void trainer_clicks_on_courses_database_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	trainer = new TrainerPageFactory(driver);
	trainer.clickOnCourseDatabase();
	 	 
}

@Then("Trainer Clicks on courses add button")
public void trainer_clicks_on_courses_add_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	trainer = new TrainerPageFactory(driver);
	trainer.clickOnAddButton();
	}

@When("Trainer is on courses add page {string} and {string} and {string} and {string}")
public void trainer_is_on_courses_add_page_and_and_and(String string, String string2, String string3, String string4) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	trainer = new TrainerPageFactory(driver);
	trainer.enterDetails(string,string2,string3,string4);
	trainer.clickSubmitButton();

}

@Then("Trainer clicks on course edit button")
public void trainer_clicks_on_course_edit_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	trainer = new TrainerPageFactory(driver);
	trainer.clickCourseEditButton();
	}

@Then("Trainer clicks on course delete button")
public void trainer_clicks_on_course_delete_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	trainer = new TrainerPageFactory(driver);
	trainer.clickCourseDeleteButton();
	}


@Then("clicks on trainer logout button")
public void clicks_on_trainer_logout_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	trainer = new TrainerPageFactory(driver);
	trainer.clickLogOut();
}
























	@Given("User is on the admin home page")
	public void user_is_on_the_admin_home_page() throws InterruptedException {

		admin = new AdminPageFactory(driver);
		admin.userIsOnAdminHomePage();

	}
	@Given("Admin clicks on navigate Student Database button")
	public void admin_clicks_on_navigate_student_database_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		admin = new AdminPageFactory(driver);
		admin.clickOnStudentDatabase();

	}

	@Then("Admin clicks on Add student button")
	public void admin_clicks_on_add_student_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		admin = new AdminPageFactory(driver);
		admin.clickOnAddButton();
	}

	@When("Admin enters valid {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void admin_enters_valid_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {
		admin = new AdminPageFactory(driver);
		admin.enterDetails(string, string2, string3, string4, string5, string6, string7, string8,string9);
		Thread.sleep(1000);
		admin.clickSubmitButton();
	}

	@Then("Admin clicks on edit button")
	public void admin_clicks_on_edit_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		admin = new AdminPageFactory(driver);
		admin.clickEditButton();
	}



	@Then("Admin clicks on delete button")
	public void admin_clicks_on_delete_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		admin = new AdminPageFactory(driver);
		admin.clickDeleteButton();


	}



	@Then("Admin Clicks on courses database button")
	public void admin_clicks_on_courses_database_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		admin = new AdminPageFactory(driver);
		admin.clickOnCourseDatabase();

	}

	@Then("Admin Clicks on courses add button")
	public void admin_clicks_on_courses_add_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		admin = new AdminPageFactory(driver);
		admin.clickOnAddButton();
	}

	@When("Admin is on courses add page {string} and {string} and {string} and {string}")
	public void admin_is_on_courses_add_page_and_and_and(String string, String string2, String string3, String string4) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		admin = new AdminPageFactory(driver);
		admin.enterDetails(string,string2,string3,string4);
		admin.clickSubmitButton();

	}

	@Then("Admin clicks on course edit button")
	public void admin_clicks_on_course_edit_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		admin = new AdminPageFactory(driver);
		admin.clickCourseEditButton();
	}

	@Then("Admin clicks on course delete button")
	public void admin_clicks_on_course_delete_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		admin = new AdminPageFactory(driver);
		admin.clickCourseDeleteButton();
	}


	@Then("clicks on navigate trainer Database button")
	public void clicks_on_navigate_trainer_database_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		admin = new AdminPageFactory(driver);
		admin.clickOnTrainerDatabase();

	}
	@Then("clicks on Add trainer button")
	public void clicks_on_add_trainer_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		admin = new AdminPageFactory(driver);
admin.clickOnTrainerAddButton();

	}
	@When("admin enters valid {string} and {string} and {string} and {string} and {string}")
	public void admin_enters_valid_and_and_and_and(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		//input[@name='TrainerID']
		//input[@name='Name']
//input[@name='Contact']
		//input[@name='Designation']
		//input[@name='Experience']
		admin = new AdminPageFactory(driver);
	admin.enterTrainerDetails(string,string2,string3,string4,string5);
	admin.clickSubmitButton();

	}

	@Then("clicks on trainer edit button")
	public void clicks_on_trainer_edit_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		admin = new AdminPageFactory(driver);
		admin.clickTrainerEditButton();
	}

	@Then("clicks on trainer delete button")
	public void trainer_delete_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);

		admin = new AdminPageFactory(driver);
		admin.clickTrainerDeleteButton();



	}

	@And ("clicks on contact list")
	public void clicks_on_contact_list() throws InterruptedException {
		admin = new AdminPageFactory(driver);
		admin.clickOnContactList();

	}
	@Then ("clicks on contact delete button")
	public void clicks_on_contact_delete_button() throws InterruptedException {
		admin = new AdminPageFactory(driver);
		admin.clickContactDeleteButton();
	}
	@Then("clicks on admin logout button")
	public void clicks_on_admin_logout_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		admin = new AdminPageFactory(driver);
admin.clickLogOut();
driver.quit();
	}















}
