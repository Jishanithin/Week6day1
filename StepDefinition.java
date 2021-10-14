package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import week2day2.DeleteLead;

public class StepDefinition {
	public ChromeDriver driver;
	public List<String> allhandle;
	public List<String> allhandle2;

	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("Load the application {string}")
	public void loadAppUrl(String url) {
		driver.get(url);

	}

	@Given("Enter the username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Home page is displayed");

		} else {
			System.out.println("Home page is not displayed");
		}

	}

	@But("Error should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error msg is displayed");

	}

	@When("Click on {string} link")
	public void clickOnCRMSFA(String linkText) {
		driver.findElement(By.linkText(linkText)).click();

	}

	@Then("{string} page should be displayed")
	public void verifyPage(String pageName) {
		System.out.println(pageName + "is displayed");

	}

	@Given("Enter the Company name as {string}")
	public void companyName(String CName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CName);

	}

	@And("Enter the First Name as {string}")
	public void firstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	}

	@And("Enter the Last Name as {string}")
	public void lastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

	}

	@When("Click on Create Lead")
	public void submitCreateLead() {
		driver.findElement(By.className("smallSubmit")).click();

	}

	@Given("Enter the FName as {string}")
	public void editSearch(String Name) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(Name);

	}

	@When("Click on Find Leads")
	public void findLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

	@When("Click First Leads")
	public void firstLead() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class='linktext'])[1]"))
				.click();

	}

	@Given("Enter the new Company name as {string}")
	public void newCompanyName(String ComName) {
		WebElement newCom = driver.findElement(By.id("updateLeadForm_companyName"));
		newCom.clear();
		newCom.sendKeys(ComName);

	}

	@When("Click on 'Update' button link")
	public void update() {
		driver.findElement(By.className("smallSubmit")).click();

	}

	@When("Click on From Lead icon")
	public void fromlead() {
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();

	}

	@When("Click on First Lead ID")
	public void selectMergeFirstID() {
		Set<String> windowHandles = driver.getWindowHandles();
		allhandle = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allhandle.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(allhandle.get(0));
	}

	@When("Click on To Lead icon")
	public void selectToLead() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		allhandle2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(allhandle2.get(1));
	}

	@When("Click on Second Lead ID")
	public void selectMergesecID() {

		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(allhandle2.get(0));
	}

	@When("Click on ok button")
	public void mergeOk() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}
	
	@When("Click on Delete button")
	public void DeleteLead() {
		driver.findElement(By.className("subMenuButtonDangerous")).click();

	}
	

	@When("Click on close button")
	public void close() {
		driver.quit();
	}

}
