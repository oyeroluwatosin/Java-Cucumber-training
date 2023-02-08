package Step_definition;

import Pages.CreateNewUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewUser {
    // Cowboy approach
    // Notice this, it's a failed automation test because it will always fail unless you introduce public int random
    public WebDriver driver;
    public int random;

    @Given("^I get on the Homescreen$")
    public void iGetOnTheHomescreen() {

        // This code will launch your browser, enter url and maximize your browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^i get on the Login Screen$")
    public void iGetOnTheLoginScreen() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickHomepageSignIn();
    }

    @And("^I enter email address for new account$")
    public void iEnterEmailAddressForNewAccount() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.EnterEmailToCreateNewUser();

    }

    @And("^I click the create account button$")
    public void iClickTheCreateAccountButton() throws InterruptedException {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickCreateAccButton();

    }

    @When("^I enter all required details$")
    public void iEnterAllRequiredDetails() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.SelectGender();
        page.EnterUserFirstName();
        page.EnterUserLastName();
        page.EnterPassword();
        page.SelectDobDay();
        page.SelectDobMonth();
        page.SelectDobYears();
        page.EnterAddress();
        page.EnterCity();
        page.SelectState();
        page.AreaPostcode();
        page.CustomerPhoneNumber();
        page.HouseNickName();
    }

    @And("^I click the register button$")
    public void iClickTheRegisterButton() {

        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.RegistrationButton();
    }

    @Then("^My account should be successfully created$")
    public void myAccountShouldBeSuccessfullyCreated() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ConfirmationRequest();

        driver.quit();
    }
}
