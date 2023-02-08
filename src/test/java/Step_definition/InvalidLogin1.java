package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin1 {

    public WebDriver driver;
    @Given("^I am on the landing page$")
    public void iAmOnTheLandingPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I select the sign in link$")
    public void iSelectTheSignInLink() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^I enter the correct Username$")
    public void iEnterTheCorrectUsername() {
        driver.findElement(By.name("email")).sendKeys("lanre_april@gmail.com");
    }

    @And("^I enter incorrect password$")
    public void iEnterIncorrectPassword() {
        driver.findElement(By.id("passwd")).sendKeys("test");
    }

    @When("^I click the button to login$")
    public void iClickTheButtonToLogin() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should get the correct error message$")
    public void iShouldGetTheCorrectErrorMessage() {
        String ExpectedErrorMessage = "Invalid password.";
        String ActualErrorMessage  = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);

        driver.quit();
    }

}
