package Step_definition;

import Pages.CreateAssertLogo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class assertLogoAndCartButtonOnHomepage {

    public WebDriver driver;
    public int random;

    @Given("^I launch a browser$")
    public void i_launch_a_browser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^I enter Application url$")
    public void i_enter_Application_url() throws Throwable {
        driver.navigate().to("http://automationpractice.com/index.php");

    }

    @When("^I wait for (\\d+) seconds$")
    public void i_wait_for_seconds(int arg1) throws Throwable {
        Thread.sleep(5000);
    }

    @Then("^I should see application logo and add to cart button$")
    public void i_should_see_application_logo_and_add_to_cart_button() throws Throwable {
        //CreateAssertLogo page = PageFactory.initElements(driver, CreateAssertLogo.class);
        //page.ConfirmHeaderLogo();
        //page.ConfirmShoppingList();
        //driver.findElement(By.id("header_logo")).isDisplayed();
        //driver.findElement(By.className("shopping_cart")).isDisplayed();
        //driver.close();
    }

}
