package Step_definition;

import Pages.CreateInvalidLogin;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class InvalidLogin3 {

    public WebDriver driver;
    public int random;

    @Given("^I land on the homepage$")
    public void iLandOnTheHomepage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @And("^I press the sign in link$")
    public void iPressTheSignInLink() {
        CreateInvalidLogin page = PageFactory.initElements(driver, CreateInvalidLogin.class);
        page.ClickHomepageSignIn();
    }

    @When("^I type \"([^\"]*)\"$")
    public void iType(String Username) throws Throwable {
        CreateInvalidLogin page = PageFactory.initElements(driver, CreateInvalidLogin.class);
        page.EnterLoginEmail(Username);
    }

    @And("^I input \"([^\"]*)\"$")
    public void iInput(String Password) throws Throwable {
        CreateInvalidLogin page = PageFactory.initElements(driver, CreateInvalidLogin.class);
        page.EnterLoginPassword(Password);
    }

    @When("^I click the button for login$")
    public void iClickTheButtonForLogin() {

        CreateInvalidLogin page = PageFactory.initElements(driver, CreateInvalidLogin.class);
        page.ClickLoginButton();
    }

    @Then("^I should get the \"([^\"]*)\" message$")
    public void iShouldGetTheMessage(String error) throws Throwable {
        CreateInvalidLogin page = PageFactory.initElements(driver, CreateInvalidLogin.class);
        page.DisplayExpectedErrorMessage(error);

        driver.quit();
    }
}

